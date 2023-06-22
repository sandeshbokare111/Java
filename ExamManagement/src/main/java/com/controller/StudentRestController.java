package com.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Question1;
import com.model.Student;
import com.repository.QuestionRepository;
import com.repository.StudRepository;

@RestController
@RequestMapping("/api")
public class StudentRestController {
		@Autowired
		StudRepository studRepo;
		
		@Autowired
		QuestionRepository qRepo;

		@GetMapping("/student")
		public List<Student> getAllStudents(Model model) {
			List<Student> list = (List<Student>) studRepo.findAll();
			return list;
		}
		
		@GetMapping("/student/{studentRollNumber}")
		public Student getStudentById(@PathVariable("studentRollNumber") int studentRollNumber) {
			Student st = new Student();
			Optional<Student> std =studRepo.findById(studentRollNumber);
			st = std.get();
			return st;		
		}
		
		@GetMapping("/student/{studentFirstName}")
		public List<Student> getStudentByName(@PathVariable ("studentFirstName") String studentFirstName, Model model){
			List<Student> list = (List<Student>) studRepo.findByStudentFirstName(studentFirstName);
			model.addAttribute(list);
			return list;
		}
		
		@PostMapping("/student")
		public Student addStudent(@RequestBody Student student) {
			Student std = new Student();
			std.setStudentFirstName(student.getStudentFirstName());
			std.setStudentLastName(student.getStudentLastName());
			std.setStudentGender(student.getStudentGender());
			std.setStudentAddress(student.getStudentAddress());
			std.setStudentCourse(student.getStudentCourse());
			studRepo.save(std);
			return std;
		}
		
		@PutMapping("/student/{studentRollNumber}")
		public Student updateStudent(@RequestBody Student student,  @PathVariable("studentRollNumber") int studentRollNumber ) {
			Student std = new Student();
			Optional<Student> st = studRepo.findById(studentRollNumber);
			std = st.get();
			std.setStudentFirstName(student.getStudentFirstName());
			std.setStudentLastName(student.getStudentLastName());
			std.setStudentGender(student.getStudentGender());
			std.setStudentAddress(student.getStudentAddress());
			std.setStudentCourse(student.getStudentCourse());
			studRepo.save(std);
			return std;
		}
		
		@DeleteMapping("/student/{studentRollNumber}")
		public void deleteMapping(@PathVariable ("studentRollNumber") int studentRollNumber) {
			studRepo.deleteById(studentRollNumber);
						
		}
		
		
		
		
////////////////////////////////-----------Question-----------/////////////////////////////////////////////
		
		@GetMapping("/question")
		public List<Question1> getAllQuestion(Model model) {
			List<Question1> list =  (List<Question1>) qRepo.findAll();
			return list;
		}
		
		@GetMapping("/question/{q_id}")
		public Question1 getQuestionById(@PathVariable("q_id") int q_id) {
			Question1 st = new Question1();
			Optional<Question1> std =qRepo.findById(q_id);
			st = std.get();		
			return st;		
		}
		
		
		
		
		
		@PostMapping("/question")
		public Question1 addQuestion(@RequestBody Question1 question) {
			Question1 q = new Question1();
			q.setQuestion(question.getQuestion());
			q.setOpt1(question.getOpt1());
			q.setOpt2(question.getOpt2());
			q.setOpt3(question.getOpt3());
			q.setCorrect_ans(question.getCorrect_ans());
			qRepo.save(q);
			return q;
		}
		
		@PutMapping("/question/{q_id}")
		public Question1 updateQuestion(@RequestBody Question1 question,  @PathVariable("q_id") int q_id ) {
			Question1 q = new Question1();
			Optional<Question1> que = qRepo.findById(q_id);
			q = que.get();
			q.setQuestion(question.getQuestion());
			q.setOpt1(question.getOpt1());
			q.setOpt2(question.getOpt2());
			q.setOpt3(question.getOpt3());
			q.setCorrect_ans(question.getCorrect_ans());
			qRepo.save(q);
			return q;
		}
		

	
		
		
		
		
		@DeleteMapping("/question/{q_id}")
		public void deleteQueMapping(@PathVariable ("q_id") int q_id) {
			qRepo.deleteById(q_id);
						
		}
//
}