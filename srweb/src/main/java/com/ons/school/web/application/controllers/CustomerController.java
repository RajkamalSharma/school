package com.ons.school.web.application.controllers;

import com.ons.school.common.vo.Customer;
import com.ons.school.web.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public Customer getCustomer(){

        return customerService.getCustomer("123");
    }
}
