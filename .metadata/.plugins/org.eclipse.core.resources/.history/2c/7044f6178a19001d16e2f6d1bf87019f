package com.spring.task1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.spring.task1.Utils.Department;
import com.spring.task1.entites.Doctor;
import com.spring.task1.entites.Hospital;
import com.spring.task1.services.DoctorService;
import com.spring.task1.services.HospitalService;

import io.swagger.annotations.Api;
import requestdto.AddDoctorOH;
import requestdto.UpdateDoctorOH;
import responsedto.DoctorDto;
import responsedto.GeneralResponseDto;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Doctor.")

public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private HospitalService hs;

//long id, String name, String dept, int age, int mobileNo, String address, String email,long hospitalId
	// get all Doctors
	@GetMapping("/getDoctors")
	public ResponseEntity<List<DoctorDto>> getDoctors() {
		System.out.println("From /getDoctors");
		List<Doctor> docs = this.doctorService.getDoctors();
		List<DoctorDto> dl = new ArrayList<>();
		for (Doctor d : docs) {
			dl.add(new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
					d.getAddress(), d.getEmail(), d.getHospital().getId()));
		}

		return new ResponseEntity<>(dl, HttpStatus.OK);

	}

	// get specific Doctor
	@GetMapping("/getDoctor/{doctorId}")
	public ResponseEntity<DoctorDto> getDoctor(@PathVariable String doctorId) {
		Doctor d = this.doctorService.getDoctor(Long.parseLong(doctorId));
		DoctorDto doc = new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
				d.getAddress(), d.getEmail(), d.getHospital().getId());
		return new ResponseEntity<>(doc, HttpStatus.OK);

	}

	// add a doctor
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/addDoctor/")
	public ResponseEntity<DoctorDto> addDoctor(@Valid @RequestBody AddDoctorOH reqBody) {
		long hospitalId = reqBody.getHospitalId();
		Hospital h = null;
		if (hospitalId != 0l) {
			this.hs.getHospital(hospitalId);
		}
		Doctor doctor = new Doctor();
		doctor.setName(reqBody.getName());
		doctor.setAddress(reqBody.getAddress());
		doctor.setAge(reqBody.getAge());
		doctor.setDept(doctor.getDept());
		doctor.setEmail(reqBody.getEmail());
		doctor.setHospital(h);
		doctor.setMobileNo(reqBody.getMobileNo());

		Doctor d = this.doctorService.addDoctor(doctor);
		
		DoctorDto doc = new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
				d.getAddress(), d.getEmail(), d.getHospital().getId());
	
		
		
		return new ResponseEntity<>(doc, HttpStatus.OK);

	}

	// update hospital
	@PutMapping("/updateDoctor")
	public ResponseEntity<DoctorDto> updateDoctor(@Valid @RequestBody UpdateDoctorOH doh) {

		long doctorId = doh.getDoctorId();
		long hospitalId = doh.getHospitalId();
		Doctor doctor = doctorService.getDoctor(doctorId);
		Hospital h = null;
		if (hospitalId != 0l) {
			this.hs.getHospital(hospitalId);
		}
		doctor.setName(doh.getName());
		doctor.setDept(Department.valueOf(Department.class, doh.getDept()));
		doctor.setAddress(doh.getAddress());
		doctor.setAge(doh.getAge());
		doctor.setEmail(doh.getEmail());
		doctor.setMobileNo(doh.getMobileNo());
		doctor.setHospital(h);
		doctor.setDeleted(doh.isDeleted());
		Doctor d = this.doctorService.updateDoctor(doctor);
		
		DoctorDto doc = new DoctorDto(d.getId(), d.getName(), d.getDept().toString(), d.getAge(), d.getMobileNo(),
				d.getAddress(), d.getEmail(), d.getHospital().getId());
	
		
		return new ResponseEntity<>(doc, HttpStatus.OK);

	}

	@DeleteMapping("/deleteDoctor/{doctorid}")
	public ResponseEntity<GeneralResponseDto> deleteDoctor(@PathVariable String doctorid) {

		this.doctorService.deleteDoctor(Long.parseLong(doctorid));
		return new ResponseEntity<GeneralResponseDto>(
				new GeneralResponseDto("Doctor with id " + doctorid + "has been deleted succesfully"), HttpStatus.OK);

	}

}
