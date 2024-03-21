package com.designpatterns.service.impl;

import com.designpatterns.integration.ViaCepService;
import com.designpatterns.model.Address;
import com.designpatterns.model.Customer;
import com.designpatterns.repository.AddressRepository;
import com.designpatterns.repository.CustomerRepository;
import com.designpatterns.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository repository;
    AddressRepository addressRepository;
    ViaCepService viaCepService;

    public CustomerServiceImpl(CustomerRepository repository, AddressRepository addressRepository, ViaCepService viaCepService) {
        this.repository = repository;
        this.addressRepository = addressRepository;
        this.viaCepService = viaCepService;
    }

    @Override
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Customer customer) {
        String cep = customer.getAddress().getCep();
        Address address = addressRepository
                .findById(cep)
                .orElseGet(() -> {
                    Address newAddress = viaCepService.checkZipCode(cep);
                    addressRepository.save(newAddress);
                    return newAddress;
                });
        customer.setAddress(address);
        repository.save(customer);
    }
}
