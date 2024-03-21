package com.designpatterns.configuration;

import com.designpatterns.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    CustomerService customerService() {
        return new CustomerService();
    }
}
