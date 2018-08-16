package com.ons.school.web.application.controllers;

import com.ons.school.web.application.exception.user.UsernotfoundException;
import com.ons.school.web.application.service.UserService;
import com.ons.school.web.application.vo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

	@Inject
	private UserService userService;

	@RequestMapping("/all")
	public List<User> getAllUsers(){
		return  userService.getAllUser();

	}

	@RequestMapping(value = "/get/{id}")
	public User getUser(@PathVariable("id") int id ){

        Optional<User> user = userService.getUser(id);

	    if(!user.isPresent()){
	        throw new UsernotfoundException("User Id is not found");
        }

        return user.get();
    }

}
