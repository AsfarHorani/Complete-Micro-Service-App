package com.spring.task1.exceptionHandler;

import org.springframework.http.HttpStatus;

public class GeneralException  extends RuntimeException {
	private static final long serialVersionUID = 1L;
    private HttpStatus httpStatus;
    private String message;

	public GeneralException(String message, HttpStatus hs ) {
		super(message);
		this.message = message;
		this.httpStatus=hs;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
    
	
	
}
