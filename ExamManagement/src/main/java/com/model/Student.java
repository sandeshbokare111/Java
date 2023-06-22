package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudTable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentRollNumber;
	private String studentFirstName;
	private String studentLastName;
	private String studentGender;
	private String studentAddress;
	private String studentCourse;
	@Override
	public String toString() {
		return "Student [studentRollNumber=" + studentRollNumber + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentGender=" + studentGender + ", studentAddress="
				+ studentAddress + ", studentCourse=" + studentCourse + "]";
	}
	public Student(int studentRollNumber, String studentFirstName, String studentLastName, String studentGender,
			String studentAddress, String studentCourse) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentGender = studentGender;
		this.studentAddress = studentAddress;
		this.studentCourse = studentCourse;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public Student() {
		super();
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	}