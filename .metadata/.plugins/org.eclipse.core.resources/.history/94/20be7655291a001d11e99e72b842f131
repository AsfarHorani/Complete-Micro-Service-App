package com.spring.task1.exceptionHandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse  {
	String message;
    Boolean sucess ;
    private HttpStatus httpStatus;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime localDateTime;
	public ErrorResponse(String message, Boolean sucess, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.sucess = sucess;
		this.httpStatus = httpStatus;
        localDateTime=LocalDateTime.now();

	}
	
	
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}



	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSucess() {
		return sucess;
	}

	public void setSucess(Boolean sucess) {
		this.sucess = sucess;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
     
	
	
	
	
}
