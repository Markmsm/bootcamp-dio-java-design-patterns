package com.designpatterns.controller;

import com.designpatterns.model.Customer;
import com.designpatterns.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Iterable<Customer>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
