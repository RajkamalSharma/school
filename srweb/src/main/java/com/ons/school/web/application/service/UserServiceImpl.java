package com.ons.school.web.application.service;

import com.ons.school.data.mysql.entity.UserEntity;
import com.ons.school.data.mysql.repository.UserRepository;
import com.ons.school.web.application.vo.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserRepository userRepository;

    @Inject
    private ModelMapper modelMapper;

    @Override
    public List<User> getAllUser() {

        return this.userRepository
                .findAll()
                .stream()
                .map(userentity -> copyUserEntityToVo(userentity))
                .collect(Collectors.toList());
    }


    @Override
    public Optional<User> getUser(int id) {
        return copyUserEntityToVoOptional(this.userRepository.findById(id));
    }

    private Optional<User> copyUserEntityToVoOptional(Optional<UserEntity> userEntity) {

        if (userEntity.isPresent()) {
            return Optional.of(copyUserEntityToVo(userEntity.get()));
        }
        return Optional.empty();

    }

    private User copyUserEntityToVo(UserEntity user) {

        User userVo = new User();
        modelMapper.map(user, userVo);
        return userVo;
    }
}
