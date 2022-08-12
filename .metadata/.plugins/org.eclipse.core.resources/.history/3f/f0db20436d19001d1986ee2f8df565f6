package com.spring.task1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.task1.Utils.H_Type;
import com.spring.task1.entites.Hospital;
import com.spring.task1.services.HospitalService;

import io.swagger.annotations.Api;
import requestdto.AddHospitaldto;
import requestdto.UpdateHospitaldto;
import responsedto.GeneralResponseDto;
import responsedto.HospitalDto;

@RestController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Hospital.")

public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	// get all hospitals
	@GetMapping("/getHospitals")
	public ResponseEntity<List<HospitalDto>> getHospitals() {
		System.out.println("From /gethospitals");
		List<Hospital> hs = this.hospitalService.getHospitals();
		List<HospitalDto> hl = new ArrayList<>();
		for(Hospital h : hs) {
			hl.add(new HospitalDto(
					h.getId(),
					h.getName(),
					h.getLocation(),
					h.getHtype().toString()
					));
		}
		return new ResponseEntity<>(hl, HttpStatus.OK);

	}

	// get specific hospital
	@GetMapping("/getHospital/{hospitalId}")
	public ResponseEntity<HospitalDto> getHospital(@PathVariable String hospitalId) {
		Hospital h = this.hospitalService.getHospital(Long.parseLong(hospitalId));
		
		HospitalDto hdt =  new HospitalDto(
				h.getId(),
				h.getName(),
				h.getLocation(),
				h.getHtype().toString()
				);
		return new ResponseEntity<>(hdt, HttpStatus.OK);

		
		
	}

	// add a hospital
	@PostMapping("/addHospital")
	public ResponseEntity<HospitalDto> addHospital(@Valid @RequestBody AddHospitaldto hospital) {
		System.out.println(hospital);
		Hospital h = new Hospital();
		h.setName(hospital.getName());
		h.setHtype(hospital.getHtype());
		h.setLocation(hospital.getLocation());
	    h =	this.hospitalService.addHospital(h);
	    HospitalDto hdt =  new HospitalDto(
				h.getId(),
				h.getName(),
				h.getLocation(),
				h.getHtype().toString()
				);
		return new ResponseEntity<>(hdt, HttpStatus.OK);

	}

	// update hospital
	@PutMapping("/updateHospital")
	public ResponseEntity<HospitalDto> updateHospital(@RequestBody UpdateHospitaldto hospitalDto) {
		System.out.println(hospitalDto);
		Hospital hospital = hospitalService.getHospital(hospitalDto.getId());
		
		hospital.setDeleted(hospitalDto.isDeleted());
		hospital.setHtype(H_Type.valueOf(H_Type.class, hospitalDto.getHtype()));
		hospital.setLocation(hospitalDto.getLocation());
		hospital.setName(hospitalDto.getName());
		hospital = this.hospitalService.updateHospital(hospital);
	   	HospitalDto hdt =  new HospitalDto(
	   			hospital.getId(),
	   			hospital.getName(),
	   			hospital.getLocation(),
	   			hospital.getHtype().toString()
				);
		return new ResponseEntity<>(hdt, HttpStatus.OK);

	}

	@DeleteMapping("/deleteHospital/{hospitalid}")
	public ResponseEntity<GeneralResponseDto> deleteHospital(@PathVariable String hospitalid) {
			this.hospitalService.deleteHospital(Long.parseLong(hospitalid));
			return new ResponseEntity<GeneralResponseDto>(new GeneralResponseDto("Hospital with id "+hospitalid+"has been deleted succesfully"),  HttpStatus.OK);

	}

}
