package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StudentRepository;
import com.dao.StudentService;
import com.model.Student;
import com.model.StudentRequest;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	StudentRepository studRepo;
	
//	Get All Students
//	@GetMapping("/student")
//	public List<Student> getStudents(){
//	 List<Student> list=(List<Student>) studRepo.findAll();
//	 System.out.println(list);
//	 return list;
//	}
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> list=(List<Student>) studRepo.findAll();
		return new ResponseEntity<List<Student>>(list, HttpStatus.CREATED);
//		Try with other status codes
	}
	
//	GetMapping Using ResponseEntity
//	@GetMapping("/student")
//	public ResponseEntity<List<Student>> getStudents() {
//		List<Student> list=(List<Student>) studRepo.findAll();
//		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
////		Try with other status codes
//	}
	
//	Get student by id
	@GetMapping("/student/{sid}")
	public Student getStudentById(@PathVariable("sid") int sid) {
		Student st = new Student();
		Optional<Student> std =studRepo.findById(sid);
		st = std.get();
		return st;		
	}
//	add/insert student
//	@PostMapping("/student")
//	public Student addStudent(@RequestBody @Valid Student student) {
//		Student st = new Student();
//		st.setSname(student.getSname());
//		st.setSaddress(student.getSaddress());
//		st.setSage(student.getSage());
//		st.setPhone(student.getPhone());
//		studRepo.save(st);
//		return st;
//	}
	@Autowired
	StudentService studSer;
	
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvaildArgument(MethodArgumentNotValidException ex){
		Map<String,String> errorMap=new HashMap<>();
		Map<String,String> errorMap2=new HashMap<>();
		
		for (int i = 0; i < ex.getFieldErrorCount(); i++) {
			errorMap.put(ex.getBindingResult().getFieldError().getField(), ex.getBindingResult().getFieldError().getDefaultMessage());
			errorMap.putAll(errorMap);
			System.out.println(errorMap);
		}
		
		
		return errorMap;
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody @Valid StudentRequest studentReq) {
//		Student st = new Student();
//		st.setSname(student.getSname());
//		st.setSaddress(student.getSaddress());
//		st.setSage(student.getSage());
//		st.setPhone(student.getPhone());
//		studRepo.save(st);
//		return st;
		return new ResponseEntity<Student>(studSer.saveStudent(studentReq),HttpStatus.OK);
	}
	
	
	
//	update student
	@PutMapping("/student/{sid}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("sid") int sid) {
		Student st = new Student();
		Optional<Student> std =studRepo.findById(sid);
		st = std.get();
		st.setSname(student.getSname());
		st.setSaddress(student.getSaddress());
		st.setSage(student.getSage());
		st.setPhone(student.getPhone());
		studRepo.save(st);
		return st;		
	}
	
//	delete student by ID
	@DeleteMapping("/student/{sid}")
	public Student deleteStudentById(@PathVariable("sid") int sid) {
		Student st = new Student();
		st= studRepo.findById(sid).get();
		studRepo.deleteById(sid);
		return st;		
	}
		
}
