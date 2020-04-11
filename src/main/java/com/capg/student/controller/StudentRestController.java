package com.capg.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.student.model.Student;
import com.capg.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	@Autowired
	StudentService service;
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> allStudents=service.getAllStudents();
		
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
	}
	
	@GetMapping("/student/id/{id}")
	
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int studentId) {
		
		Student student= service.getStudent(studentId);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		service.addStudent(student);
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}

	@PutMapping("/student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		
		Student newStudent=service.updateStudent(student);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}

	@DeleteMapping("/student/id/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") int studentId) {
		
			return new ResponseEntity<Student>(HttpStatus.OK);
		
	}
}
