package com.restapi.customer.service;

import java.util.List;

import com.restapi.customer.entity.Customer;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    List<Customer> getCustomerList();

    void deleteCustomer(Long id);

    Customer updateCustomer(Long id, Customer customer);
}

