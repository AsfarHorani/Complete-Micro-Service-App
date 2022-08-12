package requestdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.constraints.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddPatientOH {
	
   long doctorId;
	@Size(min = 5, message = "Address must be of length minimun 5")
	@Size(max = 100, message = "Address is too long, ca't contain more than 100 characters")
   String address;
   int age;

	@Email(message="Email is not valid!")
	String email;
	long mobileNo;
	
	@Size(min = 3, message = "Name is very short, should have atleast 3 characters")
    @Size(max = 40, message = "Name is too long")
	
	String name;

	
	
public AddPatientOH( String name, int age, long mobileNo, String address, String email, long doctorId) {
	super();
		this.doctorId = doctorId;
		this.address = address;
		this.age = age;
		this.email = email;
		this.mobileNo = mobileNo;
		this.name = name;
	}






	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
