package com.asfar.doctor_service.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import responsedto.HospitalDto;

@RestController
public class Index {
	 @Autowired
	    private RestTemplate restTemplate;
	// index
		@GetMapping("/")
		public HospitalDto home(){
		    HospitalDto  h = this.restTemplate.getForObject("http://hospital-service/hospital/getHospital/58", HospitalDto.class);
		      return h;
		     
		}
}