package com.ons.school.web.application.configuration;


import com.ons.school.service.customer.CustomerBusinessServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsecaseConfig {

    @Bean(name = "customerBusinessService")
    CustomerBusinessServiceImpl getCustomerBusinessService(){
        return new CustomerBusinessServiceImpl();
    }


}
