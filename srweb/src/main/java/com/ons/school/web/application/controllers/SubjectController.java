package com.ons.school.web.application.controllers;

import com.ons.school.web.application.exception.ErrorDetails;
import com.ons.school.web.application.service.SubjectService;
import com.ons.school.web.application.vo.SubjectVo;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.Date;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/subject")
public class SubjectController {

    @Inject
    private SubjectService subjectService;

    @PostMapping(value = "/add")
    public ResponseEntity<?> addSubject(@Valid @RequestBody SubjectVo subject) {

  /*      if (errors.hasErrors()) {

            ErrorDetails error = new ErrorDetails(new Date(), "Add Subject :: Error in input ",
                    errors.getAllErrors()
                            .stream()
                            .map(x -> x.getDefaultMessage())
                            .collect(Collectors.joining(",")));

            return ResponseEntity.badRequest().body(error);
        }*/

        subjectService.addSubject(subject);

        return ResponseEntity.ok().body("Subject added successfully");
    }
}
