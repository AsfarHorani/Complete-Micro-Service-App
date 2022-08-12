package com.spring.task1.entites;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.spring.task1.Utils.H_Type;

@Entity
@Table(name = "hospital")
@SQLDelete(sql = "UPDATE hospital SET deleted = true WHERE hid=?")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long hid;
    private String name;
	private String location;
	@Enumerated(EnumType.ORDINAL)
	private H_Type htype;
    private boolean deleted = Boolean.FALSE;


	public Hospital(long hid, String name, String location, H_Type htype, List<Doctor> doctors) {
		super();
		this.hid = hid;
		this.name = name;
		this.location = location;
		this.htype = htype;
	}

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public long getId() {
		return hid;
	}

	public void setId(long hid) {
		this.hid = hid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public H_Type getHtype() {
		return htype;
	}

	public void setHtype(H_Type htype) {
		this.htype = htype;
	}



	@Override
	public String toString() {
		return "Hospital [hid=" + hid + ", name=" + name + ", location=" + location + ", htype=" + htype + ", deleted="
				+ deleted + "]";
	}

}