package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
