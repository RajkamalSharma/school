package com.ons.school.web.application.service;

import com.ons.school.common.vo.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUser();

    Optional<User> getUser(int id);
}
