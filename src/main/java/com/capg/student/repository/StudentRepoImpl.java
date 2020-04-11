package com.capg.student.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.student.model.Student;

@Repository
public class StudentRepoImpl {
	@PersistenceContext
	EntityManager entityManger;
	
	public Student addStudent(Student student) {
		entityManger.persist(student);
		return student;
	}
	
	public  Student getUser(int studentId) {
		return entityManger.find(Student.class, studentId);
	}
	
}
