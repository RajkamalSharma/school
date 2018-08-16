package com.ons.school.web.application.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsecaseConfig {

/*
    @Bean(name = "customerBusinessService")
    CustomerBusinessServiceImpl getCustomerBusinessService(){
        return new CustomerBusinessServiceImpl();
    }
*/

    @Bean
    ModelMapper getModelMapper(){
        return new ModelMapper();
    }


}
