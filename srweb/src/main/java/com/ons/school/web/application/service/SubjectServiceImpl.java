package com.ons.school.web.application.service;

import com.ons.school.data.mysql.entity.SubjectEntity;
import com.ons.school.data.mysql.repository.SubjectRepository;
import com.ons.school.web.application.vo.SubjectVo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import javax.inject.Inject;


@Service
public class SubjectServiceImpl implements SubjectService {

    @Inject
    private SubjectRepository subjectRepository;

    @Inject
    private ModelMapper mapper;

    //@Transactional
    public void addSubject(SubjectVo subjectVo) {

        SubjectEntity subjectEntity = new SubjectEntity();
        mapper.map(subjectVo ,subjectEntity );
        subjectRepository.save(subjectEntity);

    }

}
