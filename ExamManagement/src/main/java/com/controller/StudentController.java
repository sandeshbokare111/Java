package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.model.Question1;
import com.model.Student;
import com.repository.QuestionRepository;
import com.repository.StudRepository;

@Controller
@RequestMapping("/exam")
public class StudentController {
	
	@Autowired
	StudRepository studRepo;
	
	@Autowired
	QuestionRepository qRepo;

	
	@RequestMapping("/home")
	public String adminMenu(){
		return "home";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
///////////////////////////------------Add student-------------/////////////////////////////////////////
	
	@RequestMapping("/addstudent")
	public String addStudent() {
		return "addstudent";
	}
	
	@RequestMapping("/addedsuccess")
	public String  addedSuccess(@ModelAttribute Student student) {
		Student std = new Student();
		std.setStudentFirstName(student.getStudentFirstName());
		std.setStudentLastName(student.getStudentLastName());
		std.setStudentGender(student.getStudentGender());
		std.setStudentAddress(student.getStudentAddress());
		std.setStudentCourse(student.getStudentCourse());
		studRepo.save(std);
		return "addedsuccess";		
	}
	
///////////////////////////------------Update student-------------/////////////////////////////////////////

	@RequestMapping("/updatestudent")
	public String updateStudent() {
		return "updatestudent";
	}

	@RequestMapping("/updateindb")
	public String updateInDb(@ModelAttribute Student student) {
		Student st = new Student();
		Optional<Student> std = studRepo.findById(student.getStudentRollNumber());
		st = std.get();
		st.setStudentFirstName(student.getStudentFirstName());
		st.setStudentLastName(student.getStudentLastName());
		st.setStudentGender(student.getStudentGender());
		st.setStudentAddress(student.getStudentAddress());
		st.setStudentCourse(student.getStudentCourse());
		studRepo.save(st);
		return "updatesuccess";
	}
	
///////////////////////////------------delete student-------------/////////////////////////////////////////

	@RequestMapping("/deletestudent")
	public String deleteStudent() {
		return "deletestudent";
	}

	@RequestMapping("deletefromdb")
	public String deleteFromDatabase(@RequestParam("studentRollNumber") int studentRollNumber) {
		studRepo.deleteById(studentRollNumber);
		return "deletesuccess";
	}

///////////////////////////------------Get students-------------/////////////////////////////////////////
	
	
	@RequestMapping("/getstudents")
	public String getAllStudents(Model model) {
		List<Student> list = (List<Student>) studRepo.findAll();
		model.addAttribute("students", list);
		return "getallstudents";
	}
	
///////////////////////////------------get student by id-------------/////////////////////////////////////////

	
	@RequestMapping("/getstudent")
	public String getStudent() {
		return "getstudent";

	}
	
	
	@RequestMapping("/displaystudent")
	public String displayStudent(@RequestParam("studentRollNumber") int studentRollNumber, Model model) {
		Student st = studRepo.findById(studentRollNumber).get();
		model.addAttribute("student",st);
		return "displaystudent";
	}

	
///////////////////////////------------get student by name-------------/////////////////////////////////////////
	@RequestMapping("/getstudentbyname")
	public String getStudentByName() {
		return "getstudentbyname";
	}
	
	@RequestMapping("/displaystudentbyname")
	public String displayStudentByName(@RequestParam ("studentFirstName") String studentFirstName, Model model) {
		Student st =  studRepo.findByStudentFirstName(studentFirstName);
		model.addAttribute("student",st);
		return "displaystudbyname";
		
	}
	
	
	
	
/////////////////////------------------Questions------------------------/////////////////////////////////////
	
	
///////////////////////////------------Add Question-------------/////////////////////////////////////////

	@RequestMapping("/addquestion")
	public String addQuestion() {
		return "addquestion";
	}
	
	@RequestMapping("/addedindbs")
	public String addedQue(@ModelAttribute Question1 question) {
		qRepo.save(question);
		return "addedsuccessque";
	}
	
///////////////////////////------------Update Question-------------/////////////////////////////////////////


	@RequestMapping("/updatequestion")
	public String updateQuestion() {
		return "updatequestion";
	}
	
	@RequestMapping("/updateindbs")
	public String updatedQue(@ModelAttribute Question1 question) { 
		Question1 q = new Question1();
		Optional<Question1> que = qRepo.findById(question.getQ_id());
		q = que.get();
		q.setQuestion(question.getQuestion());
		q.setOpt1(question.getOpt1());
		q.setOpt2(question.getOpt2());
		q.setOpt3(question.getOpt3());
		q.setCorrect_ans(question.getCorrect_ans());
		qRepo.save(q);
		return "updateqsuccess";
	}

	
///////////////////////////------------Get all Question-------------/////////////////////////////////////////
	
	@RequestMapping("/getallquestions")
	public String getAllQuestions(Model model) {
		List<Question1> list = (List<Question1>) qRepo.findAll();
		System.out.println(list.toString());
		model.addAttribute("lists",list);
		return "getallquestions";
	}
	
	
///////////////////////////------------Delete Question-------------/////////////////////////////////////////
	
	@RequestMapping("/deletequestion")
	public String getQuestionById() {
		return "deletequestion";
	}
	
	@RequestMapping("/deletequestionindb")
	public String deleteQuestionindb(@RequestParam ("q_id") int q_id ) {
		qRepo.deleteById(q_id);
		return "deletesuccessque";
	}
}