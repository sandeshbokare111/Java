package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.model.StudentRequest;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studRepo;
	
	public Student saveStudent(StudentRequest stReq) {
		Student st = new Student();
		st.setSid(0);
		st.setSname(stReq.getSname());
		st.setSaddress(stReq.getSaddress());
		st.setSage(stReq.getSage());
		st.setPhone(stReq.getPhone());
		return studRepo.save(st);
		
	}

}
