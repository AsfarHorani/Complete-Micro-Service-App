package responsedto;

public class DoctorDto {
	
	private long id;
	String name;
	private String dept;
	private int age;
	private long mobileNo;
	String address;	
	String email;	
	private long hospitalId;
	
	
	
	
	public DoctorDto(long id, String name, String dept, int age, long mobileNo, String address, String email,
			long hospitalId) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
		this.hospitalId = hospitalId;
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
	public long getMobileNo() {
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
