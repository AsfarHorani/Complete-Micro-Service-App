package com.spring.task1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.spring.task1.entites.*;

import com.spring.task1.services.DoctorService;
import com.spring.task1.services.PatientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import requestdto.AddPatientOH;
import requestdto.UpdatePatientOH;
import responsedto.*;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Patient.")

public class PatientController {

	@Autowired
	public PatientService patientService;
	@Autowired
	public DoctorService doctorService;
	
	@GetMapping("/getPatients")
    @ApiOperation("Returns list of all patients in the system.")
	public ResponseEntity<List<PatientDto>>  getPatients() {
// AddPatientOH(long id, String name, int age, int mobileNo, String address, String email, long doctorId)

		List<Patient> pl= this.patientService.getPatients();
		List<PatientDto> pdt = new ArrayList<>();
		for(Patient p : pl)
		{
		   if(!p.isDeleted())
			pdt.add(new PatientDto(
					p.getId(),
					p.getName(),
					p.getAge(),
					p.getMobileNo(),
					p.getAddress(),
					p.getEmail(),
					p.getDoctor().getId()));
		   

		}
		return new ResponseEntity<>(pdt, HttpStatus.OK);

	}

	@GetMapping("/getPatient/{patientId}")
    @ApiOperation("Returns a specific patient with the patientId provided")

	public ResponseEntity<PatientDto> getPatient(@PathVariable String patientId) {
		System.out.println(patientId);

		Patient p = this.patientService.getPatient(Long.parseLong(patientId));
		PatientDto pdt = new PatientDto(
				p.getId(),
				p.getName(),
				p.getAge(),
				p.getMobileNo(),
				p.getAddress(),
				p.getEmail(),
				p.getDoctor().getId());

		return new ResponseEntity<>(pdt, HttpStatus.OK);


	}

	@PostMapping("/addPatient")
	@ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Add a patient with its info provided")

	public ResponseEntity<PatientDto> addPatient(@Valid @RequestBody AddPatientOH reqBody) {

		Patient patient = new Patient();	
		
		Doctor d=null;
		if(reqBody.getDoctorId()!=0L)
		{
			
			d = doctorService.getDoctor(reqBody.getDoctorId());

		}
		
		patient.setAddress(reqBody.getAddress());
		patient.setAge(reqBody.getAge());
		patient.setEmail(reqBody.getEmail());
		patient.setMobileNo(reqBody.getMobileNo());
		patient.setName(reqBody.getName());
		patient.setDoctor(d);
		Patient p = this.patientService.addPatient(patient);
		PatientDto pdt = new PatientDto(
				p.getId(),
				p.getName(),
				p.getAge(),
				p.getMobileNo(),
				p.getAddress(),
				p.getEmail(),
				p.getDoctor().getId());
		return new ResponseEntity<>(pdt, HttpStatus.OK);
	}

	@PutMapping("/updatePatient")
    @ApiOperation("update a patient with its info provided")

	public ResponseEntity<PatientDto> updatePatient(@RequestBody UpdatePatientOH poh) {
		
			long doctorId = poh.getDoctorId();
			long patientId = poh.getPatientId();
			Patient patient = this.patientService.getPatient(patientId);
			Doctor d = doctorService.getDoctor(doctorId);
			patient.setName(poh.getName());
			patient.setAddress(poh.getAddress());
			patient.setAge(poh.getAge());
			patient.setEmail(poh.getEmail());
			patient.setMobileNo(poh.getMobileNo());
			patient.setDoctor(d);
			patient.setDeleted(poh.isDeleted());
			Patient p = this.patientService.updatePatient(patient);
			
			PatientDto pdt = new PatientDto(
					p.getId(),
					p.getName(),
					p.getAge(),
					p.getMobileNo(),
					p.getAddress(),
					p.getEmail(),
					p.getDoctor().getId());
			
			
			return new ResponseEntity<>(pdt, HttpStatus.OK);

	}

	@DeleteMapping("/deletePatient/{patientId}")
    @ApiOperation("delete a patient with its info provided")

	public ResponseEntity <GeneralResponseDto>deletePatient(@PathVariable String patientId) {
	
			this.patientService.deletePatient(Long.parseLong(patientId));
			return new ResponseEntity<GeneralResponseDto>(new GeneralResponseDto("Patient with id "+patientId+"has been deleted succesfully"),  HttpStatus.OK);
		
	}

}
