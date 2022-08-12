package com.asfar.patient_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import responsedto.DoctorDto;

@RestController
public class Index {
	 @Autowired
	    private RestTemplate restTemplate;
	// index
		@GetMapping("/")
		public DoctorDto home() {
			return this.restTemplate.getForObject("http://doctor-service/doctor/getDoctor/1", DoctorDto.class);

		}
}
