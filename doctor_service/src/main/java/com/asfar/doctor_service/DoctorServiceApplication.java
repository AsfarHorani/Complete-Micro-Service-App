package com.asfar.doctor_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}

	@Bean //this methods will be executed only once to avoid getting multiple instances.
	@LoadBalanced
	public RestTemplate getRestTemplate()
    {
         final RestTemplate restTemplate = new RestTemplate();

         System.out.println("rest template defined");

         return  restTemplate;
    }
	
	
}
