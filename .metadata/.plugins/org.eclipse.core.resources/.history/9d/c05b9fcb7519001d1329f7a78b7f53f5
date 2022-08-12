package requestdto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.task1.Utils.H_Type;

public class UpdateHospitaldto {
	
	@NotNull
	private long id;
	
	@Size(min = 5, message = "Name is very short, should have atleast 3 characters")
    @Size(max = 100, message = "Name is too long")
	private String name;
	
	@Size(min = 5, message = "Address must be of length minimun 5")
	@Size(max = 200, message = "Address is too long, ca't contain more than 100 characters")
    private String location;
	private String htype;
	@JsonIgnore
	private boolean deleted;
	
	
	
	
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
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	



}
