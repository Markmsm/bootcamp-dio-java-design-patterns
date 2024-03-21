package com.designpatterns.service;

import com.designpatterns.model.Customer;

public interface CustomerService {
    Iterable<Customer> getAll();
}
