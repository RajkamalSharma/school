package com.ons.school.web.application.service;

import com.ons.school.data.couchbase.entity.CustomerEntity;
import com.ons.school.data.couchbase.repository.CustomerSBRepository;

import javax.inject.Inject;

import com.ons.school.web.application.vo.Customer;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerSBRepository customerSBRepository;

    public Customer getCustomer(String customerDocumentId) {

        Optional<CustomerEntity> custEntity =  customerSBRepository.findById(customerDocumentId);
        return getCustomerFromEntity(custEntity.get());

    }

    private Customer getCustomerFromEntity(CustomerEntity entity){

        Customer customer = new Customer();

        customer.setCustomerId(entity.getCustomerId());
        customer.setCustomerName(entity.getCustomerName());
        customer.setCustomerAddress(entity.getCustomerAddress());
        customer.setCustomerAvgRevenuePerAnnum(entity.getCustomerAvgRevenuePerAnnum());

        return  customer;
    }

}
