package com.asfar.doctor_service.entites;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.asfar.doctor_service.Utils.*;
import com.asfar.doctor_service.entites.*;
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
	  @Column(name = "hid")
//	  @OnDelete(action = OnDeleteAction.NO_ACTION)
//	  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    private long hospitalId;
    
    
    
    
	@Override
	public String toString() {
		return "Doctor [dept=" + dept + ", deleted=" + deleted + ", hospitalId=" + hospitalId + ", getDept()="
				+ getDept() + ", isDeleted()=" + isDeleted() + ", getHospitalId()=" + getHospitalId() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail()
				+ ", getMobileNo()=" + getMobileNo() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}
	 
    


}