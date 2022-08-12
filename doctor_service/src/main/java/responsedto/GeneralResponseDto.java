package responsedto;

public class GeneralResponseDto {

	String message;
	public GeneralResponseDto( String message) {
		super();
		this.message = message;
	
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
