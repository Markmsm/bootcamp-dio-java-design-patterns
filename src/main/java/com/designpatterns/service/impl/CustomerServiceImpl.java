package com.designpatterns.service.impl;

import com.designpatterns.model.Customer;
import com.designpatterns.repository.CustomerRepository;
import com.designpatterns.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository repository;
    @Override
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }
}
