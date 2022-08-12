package requestdto;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spring.task1.Utils.H_Type;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddHospitaldto {
	@Size(min = 5, message = "Name is very short, should have atleast 3 characters")
    @Size(max = 100, message = "Name is too long")
	private String name;
	
	@Size(min = 5, message = "Address must be of length minimun 5")
	@Size(max = 200, message = "Address is too long, ca't contain more than 100 characters")
    private String location;
	private H_Type htype;
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

	
	
	
	
}
