package com.asfar.patient_service.services;

import java.util.List;

import com.asfar.patient_service.entites.*;

public interface PatientService {
	 
	
		public List<Patient> getPatients( );
		public Patient getPatient(long did);
		public Patient addPatient(Patient patient);
		public Patient updatePatient(Patient patient);
		public void deletePatient(long pid);
}
