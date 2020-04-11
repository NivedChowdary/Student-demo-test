package com.capg.student.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.student.exceptions.StudentNotFound;

@ControllerAdvice
@RestController
public class StudentErrorController {

	@ExceptionHandler(StudentNotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Student Not Found" , code = HttpStatus.NOT_FOUND)
	public void handleUserNotFoundException() {
		
}
}
