package requestdto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddDoctorOH {
	
	@Size(min = 5, message = "Address must be of length minimun 5")
	@Size(max = 100, message = "Address is too long, ca't contain more than 100 characters")
    String address;
	int age;
	
	String dept;
	
	@Email(message="Email is not valid!")
	String email;
	long hospitalId;
	long mobileNo;
	
	@Size(min = 3, message = "Name is very short, should have atleast 3 characters")
    @Size(max = 40, message = "Name is too long")
	String name;

	public AddDoctorOH(String address, int age, String dept, String email, long hospitalId, long mobileNo,
			String name) {
		super();
		this.address = address;
		this.age = age;
		this.dept = dept;
		this.email = email;
		this.hospitalId = hospitalId;
		this.mobileNo = mobileNo;
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

//{
//	  "address": "string",
//	  "age": 0,
//	  "deleted": true,
//	  "dept": "GASTROENTEROLOGIST",
//	  "email": "string",
//	  
//	  "id": 0,
//	  "mobileNo": 0,
//	  "name": "string"
//	}