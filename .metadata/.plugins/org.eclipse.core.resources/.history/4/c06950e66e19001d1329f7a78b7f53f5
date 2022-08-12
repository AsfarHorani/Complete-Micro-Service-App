package com.spring.task1.exceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import  org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.springframework.validation.FieldError;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value={GeneralException.class})
	public ResponseEntity<ErrorResponse> handleApiRequestException(GeneralException e) {

		ErrorResponse apiresponse = new ErrorResponse(e.getMessage(),false, e.getHttpStatus()) ;
		return new ResponseEntity<ErrorResponse>(apiresponse, e.getHttpStatus());
	}
	

	   @ExceptionHandler({MethodArgumentNotValidException.class})
	   public ResponseEntity<Object> handleMethodArgumentNotValidException(
	            MethodArgumentNotValidException exception) {
		   
	        Map<Object, String> errors = exception.getBindingResult().getAllErrors()
	                .stream()
	                .collect(
	                        Collectors.toMap(error ->
	                                        ((FieldError) error).getField(),
	                                DefaultMessageSourceResolvable::getDefaultMessage));
	        
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	    }
	

	@ExceptionHandler(value={Exception.class})
	public ResponseEntity<ErrorResponse> handleApiRequestException(Exception e) {

		ErrorResponse apiresponse = new ErrorResponse(e.getMessage(),false, HttpStatus.INTERNAL_SERVER_ERROR );
        System.out.println("exception general"+ e);

		return new ResponseEntity<ErrorResponse>(apiresponse,  HttpStatus.INTERNAL_SERVER_ERROR);
	}
     
	
	
	
}
