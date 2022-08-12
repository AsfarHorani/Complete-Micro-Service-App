package com.asfar.hospital_service.services;

import java.util.List;

import com.asfar.hospital_service.entities.*;

public interface HospitalService {

	
	public List<Hospital> getHospitals();
	public Hospital getHospital(long hid);
	public Hospital addHospital(Hospital hospital);
	public Hospital updateHospital(Hospital hospital);
	public void deleteHospital(long hid);

    
}
