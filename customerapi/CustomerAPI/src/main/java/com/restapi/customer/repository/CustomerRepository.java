package com.restapi.customer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByid(Long id);
    
}
