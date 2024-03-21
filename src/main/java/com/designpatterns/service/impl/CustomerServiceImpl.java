package com.designpatterns.service.impl;

import com.designpatterns.model.Customer;
import com.designpatterns.repository.CustomerRepository;
import com.designpatterns.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository repository;
    @Override
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }
}
