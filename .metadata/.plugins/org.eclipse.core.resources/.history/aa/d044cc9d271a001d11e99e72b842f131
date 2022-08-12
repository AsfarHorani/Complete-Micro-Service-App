package com.spring.task1.entites;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.task1.Utils.Department;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "doctor")
@SQLDelete(sql = "UPDATE doctor SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")

public class Doctor extends User {

	@Enumerated(EnumType.ORDINAL)
    private Department dept;
    private boolean deleted = Boolean.FALSE;


	  public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "hid", nullable = false)
	  @OnDelete(action = OnDeleteAction.NO_ACTION)
	  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	
	  private Hospital hospital;
	 
	 @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER)
     	private List<Patient> patients;

	 @JsonIgnore
    public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Doctor(long id, String name, Department dept) {
		super();

		this.dept = dept;
	}

	public Doctor(long id, String name, int age, String email, int mobileNo, String address) {
		super(id, name, age, email, mobileNo, address);
		// TODO Auto-generated constructor stub
	}

	public Hospital getHospital() {

		return hospital;
	}

	public Doctor(Department dept, Hospital hospital) {
		super();
		this.dept = dept;
		this.hospital = hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Doctor [dept=" + dept + ", deleted=" + deleted + ", hospital=" + hospital + "]";
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}