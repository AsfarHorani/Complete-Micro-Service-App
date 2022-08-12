package com.asfar.doctor_service.services;

import java.util.List;

import com.asfar.doctor_service.entites.*;

public interface DoctorService {
	
	public List<Doctor> getDoctors();
	public Doctor getDoctor(long did);
	public Doctor addDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public void deleteDoctor(long hid);

}
