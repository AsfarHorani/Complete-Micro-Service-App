package responsedto;

public class HospitalDto {
 
	private long id;
	private String name;
	private String location;
	private String htype;
	
	public HospitalDto(long id, String name, String location, String htype) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.htype = htype;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	
	
	
}
