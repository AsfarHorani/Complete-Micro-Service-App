package com.asfar.hospital_service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asfar.hospital_service.entities.*;



public interface HospitalDao  extends JpaRepository<Hospital,Long>{
    List<Hospital> findAllBydeleted(boolean deleted);

}
