package com.cafe.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cafe.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value=ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> ResourceNotFoundException(ResourceNotFoundException ex)
	{
		ApiResponse response=new ApiResponse(ex.getMessage(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}

}
