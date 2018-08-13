package com.ons.school.web.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoController {
	
	@RequestMapping("/demo")
	public String getDemoTestString(){
		return "Working !!";	
	}



}
