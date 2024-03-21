package com.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BootcampDioJavaDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampDioJavaDesignPatternsApplication.class, args);
	}

}
