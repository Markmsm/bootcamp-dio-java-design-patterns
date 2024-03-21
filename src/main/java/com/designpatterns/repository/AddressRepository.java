package com.designpatterns.repository;

import com.designpatterns.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {}
