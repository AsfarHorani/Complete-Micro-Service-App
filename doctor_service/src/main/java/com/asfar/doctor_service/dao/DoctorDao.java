package com.asfar.doctor_service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asfar.doctor_service.entites.*;

public interface DoctorDao extends JpaRepository<Doctor,Long>{
	Doctor findByemail(String email);
	Doctor findBymobileNo(long mobileNo);
    List<Doctor> findAllBydeleted(boolean deleted);
}
