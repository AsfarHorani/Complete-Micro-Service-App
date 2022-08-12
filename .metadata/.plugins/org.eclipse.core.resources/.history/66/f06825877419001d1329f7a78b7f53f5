package com.spring.task1.entites;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//
@Entity
@Table(name = "patient")
@SQLDelete(sql = "UPDATE patient SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")

public class Patient extends User {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "did", nullable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Doctor doctor;
	@Column(name = "deleted", nullable = false, columnDefinition = "boolean default false")
	private boolean deleted = Boolean.FALSE;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(long id, String name, int age, String email, int mobileNo, String address) {
		super(id, name, age, email, mobileNo, address);
		// TODO Auto-generated constructor stub
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient(long id, String name, int age, String email, int mobileNo, String address, Doctor doctor) {
		super(id, name, age, email, mobileNo, address);
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [doctor=" + doctor + ", deleted=" + deleted + "]";
	}

}
