package com.designpatterns.repository;

import com.designpatterns.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}
