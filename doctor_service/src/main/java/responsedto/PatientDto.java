package responsedto;

public class PatientDto {
	
	private long id;
	String name;
	private int age;
	private long mobileNo;
	 String address;	
	String email;	
	private long doctorId;
	

	public PatientDto(long id, String name, int age, long mobileNo, String address, String email, long doctorId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
		this.doctorId = doctorId;
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
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	
	
	
	
}
