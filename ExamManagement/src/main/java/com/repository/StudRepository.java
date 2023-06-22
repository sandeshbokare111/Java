package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface StudRepository extends CrudRepository<Student,Integer>{
	public Student findByStudentFirstName(String studentFirstName);

}
