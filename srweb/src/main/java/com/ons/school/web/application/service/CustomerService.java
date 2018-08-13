package com.ons.school.web.application.service;


import com.ons.school.common.vo.Customer;

public interface CustomerService {

    public Customer getCustomer(String customerDocumentId);
}
