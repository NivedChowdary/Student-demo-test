package com.capg.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.student.exceptions.StudentNotFound;
import com.capg.student.model.Student;
import com.capg.student.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;

	public List<Student> getAllStudents(){
      	return repo.findAll();
	}
	public Student getStudent(int studentId) {
		if(!repo.existsById(studentId)) {
			throw new StudentNotFound("student with id : ["+studentId+"] Not Found"); 
		}
		return repo.getOne(studentId);
	}
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}	
	
	public boolean deleteStudent(int studentId) {
		repo.deleteById(studentId);
		return !repo.existsById(studentId);
	}
	
	public Student updateStudent(Student newStudent) {
		Student student=repo.getOne(newStudent.getStudentId());		
		student.setDob(newStudent.getDob());
		student.setStudentName(newStudent.getStudentName());
		repo.save(student);
		return student;

}
}
