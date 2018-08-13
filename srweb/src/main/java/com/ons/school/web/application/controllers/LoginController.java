package com.ons.school.web.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String getDemoTestString(){
        return "Login Working !!";
    }

}
