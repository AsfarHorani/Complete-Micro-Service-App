package com.spring.task1.entites;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.*;

@ApiModel(description = "Class representing a user tracked by the application.")
 @MappedSuperclass
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private String name;
	 
	private int age;
	@Column(name = "email", unique=true)
	
	private String email;
	@Column(name = "mobileNo", unique=true)
	private long mobileNo;
	private String address;
	
	public User(long id, String name, int age, String email, int mobileNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
