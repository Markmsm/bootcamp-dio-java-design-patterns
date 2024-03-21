package com.designpatterns.controller;

import com.designpatterns.model.Customer;
import com.designpatterns.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        service.save(customer);
        return ResponseEntity.ok(customer);
    }
}
