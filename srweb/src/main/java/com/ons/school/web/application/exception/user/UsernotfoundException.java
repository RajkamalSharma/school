package com.ons.school.web.application.exception.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsernotfoundException extends RuntimeException {

    public UsernotfoundException(String exception){
        super(exception);
    }

}
