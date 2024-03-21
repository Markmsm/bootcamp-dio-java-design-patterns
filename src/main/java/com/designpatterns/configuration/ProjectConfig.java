package com.designpatterns.configuration;

import com.designpatterns.integration.ViaCepService;
import com.designpatterns.repository.AddressRepository;
import com.designpatterns.repository.CustomerRepository;
import com.designpatterns.service.CustomerService;
import com.designpatterns.service.impl.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    CustomerService customerService(CustomerRepository repository,
                                    AddressRepository addressRepository,
                                    ViaCepService viaCepService) {
        return new CustomerServiceImpl(repository, addressRepository, viaCepService);
    }
}
