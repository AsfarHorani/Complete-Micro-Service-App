package com.asfar.hospital_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class HospitalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalServiceApplication.class, args);
	}
	
	
	@Bean //this methods will be executed only once to avoid getting multiple instances.
    public RestTemplate getRestTemplate()
    {
         final RestTemplate restTemplate = new RestTemplate();

         System.out.println("rest template defined");

         return  restTemplate;
    }

}
