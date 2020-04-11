package com.capg.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.student.model.Student;
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
