package requestdto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpdateDoctorOH {
	@NotNull
	private long doctorId;
	@Size(min = 3, message = "Name is very short, should have atleast 3 characters")
    @Size(max = 40, message = "Name is too long")
	String name;
	private String dept;
	private int age;
	private int mobileNo;
	@Size(min = 5, message = "Address must be of length minimun 5")
	@Size(max = 100, message = "Address is too long, ca't contain more than 100 characters")
    String address;	
	@Email(message="Email is not valid!")
	String email;	private long hospitalId;
	@JsonIgnore
	private boolean deleted;
	
	
	
	
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}




}
