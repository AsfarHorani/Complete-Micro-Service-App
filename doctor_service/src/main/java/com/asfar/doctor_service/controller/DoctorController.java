package com.asfar.doctor_service.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.asfar.doctor_service.Utils.*;
import com.asfar.doctor_service.entites.*;
import com.spring.task1.entites.Hospital;
import com.asfar.doctor_service.dao.*;
import com.asfar.doctor_service.services.*;

import io.swagger.annotations.Api;
import requestdto.AddDoctorOH;
import requestdto.UpdateDoctorOH;
import responsedto.DoctorDto;
import responsedto.GeneralResponseDto;
import responsedto.HospitalDto;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Doctor.")

@RequestMapping("/doctor")

public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	 @Autowired
	    private RestTemplate restTemplate;

//long id, String name, String dept, int age, int mobileNo, String address, String email,long hospitalId
	// get all Doctors
	@GetMapping("/getDoctors")
	public ResponseEntity<List<DoctorDto>> getDoctors() {
		System.out.println("From /getDoctors");
		List<Doctor> docs = this.doctorService.getDoctors();
		List<DoctorDto> dl = new ArrayList<>();
		for (Doctor d : docs) {
			dl.add(new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
					d.getAddress(), d.getEmail(), d.getHospitalId()));
		}

		return new ResponseEntity<>(dl, HttpStatus.OK);

	}

	// get specific Doctor
	@GetMapping("/getDoctor/{doctorId}")
	public ResponseEntity<DoctorDto> getDoctor(@PathVariable String doctorId) {
		Doctor d = this.doctorService.getDoctor(Long.parseLong(doctorId));
		DoctorDto doc = new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
				d.getAddress(), d.getEmail(), d.getHospitalId());
		return new ResponseEntity<>(doc, HttpStatus.OK);

	}

	// add a doctor
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/addDoctor/")
	public ResponseEntity<DoctorDto> addDoctor(@Valid @RequestBody AddDoctorOH reqBody) throws URISyntaxException {
		long hospitalId = reqBody.getHospitalId();
		HospitalDto h = null;
		if (hospitalId != 0l) {
		     h = this.restTemplate.getForObject("http://hospital-service/hospital/getHospital/"+hospitalId, HospitalDto.class);
		     System.out.println(h);
		     
		}
		Doctor doctor = new Doctor();
		doctor.setName(reqBody.getName());
		doctor.setAddress(reqBody.getAddress());
		doctor.setAge(reqBody.getAge());
		doctor.setDept(doctor.getDept());
		doctor.setEmail(reqBody.getEmail());
		doctor.setHospitalId(hospitalId);
		doctor.setMobileNo(reqBody.getMobileNo());

		Doctor d = this.doctorService.addDoctor(doctor);
		
		DoctorDto doc = new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
				d.getAddress(), d.getEmail(), d.getHospitalId());
	
		
		
		return new ResponseEntity<>(doc, HttpStatus.OK);

	}

	// update hospital
	@PutMapping("/updateDoctor")
	public ResponseEntity<DoctorDto> updateDoctor(@Valid @RequestBody UpdateDoctorOH doh) {

		long doctorId = doh.getDoctorId();
		long hospitalId = doh.getHospitalId();
		Doctor doctor = doctorService.getDoctor(doctorId);
		HospitalDto h = null;
		if (hospitalId != 0l) {
		     h = this.restTemplate.getForObject("http://hospital-service/hospital/getHospital/"+hospitalId, HospitalDto.class);

		}
		doctor.setName(doh.getName());
		doctor.setDept(Department.valueOf(Department.class, doh.getDept()));
		doctor.setAddress(doh.getAddress());
		doctor.setAge(doh.getAge());
		doctor.setEmail(doh.getEmail());
		doctor.setMobileNo(doh.getMobileNo());
		doctor.setHospitalId(doctorId);
		doctor.setDeleted(doh.isDeleted());
		Doctor d = this.doctorService.updateDoctor(doctor);
		
		DoctorDto doc = new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
				d.getAddress(), d.getEmail(), d.getHospitalId());
	
		
		return new ResponseEntity<>(doc, HttpStatus.OK);

	}

	@DeleteMapping("/deleteDoctor/{doctorid}")
	public ResponseEntity<GeneralResponseDto> deleteDoctor(@PathVariable String doctorid) {

		this.doctorService.deleteDoctor(Long.parseLong(doctorid));
		return new ResponseEntity<GeneralResponseDto>(
				new GeneralResponseDto("Doctor with id " + doctorid + "has been deleted succesfully"), HttpStatus.OK);

	}

}