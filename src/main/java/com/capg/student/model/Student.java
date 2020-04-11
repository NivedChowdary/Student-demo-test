package com.capg.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private String dob;
	public Student(int studentId, String studentName, String dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dob = dob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + "]";
	}
	
	

}
