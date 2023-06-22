package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.StudentRepository;
import com.model.Student;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studReo;
	
	@RequestMapping("/test")
	public String getTest() {
		return "test";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";

	}

	@RequestMapping("/addstudent")
	public String addStudent() {
		return "addstudent";

	}

	@RequestMapping("/addedsuccess")
	public String addStudentInDb(@ModelAttribute Student student, Model model) {
		Student stud = new Student();
		stud.setSname(student.getSname());
		stud.setSaddress(student.getSaddress());
		stud.setPhone(student.getPhone());
		stud.setSage(student.getSage());
		studReo.save(stud);
		System.out.println("Added ");
		model.addAttribute("student", student);
		return "addedsuccess";

	}

	@RequestMapping("/updatestudent")
	public String updateStudent() {
		return "updatestudent";
	}

	@RequestMapping("/updateindb")
	public String updateInDb(@ModelAttribute Student student) {
		Student st = new Student();
		Optional<Student> std = studReo.findById(student.getSid());
		st = std.get();
		st.setSname(student.getSname());
		st.setSaddress(student.getSaddress());
		st.setSage(student.getSage());
		st.setPhone(student.getPhone());
		studReo.save(st);
		return "updatesuccess";

	}

	@RequestMapping("/deletestudent")
	public String deleteStudent() {
		return "deletestudent";

	}

	@RequestMapping("deletefromdb")
	public String deleteFromDatabase(@RequestParam("sid") int sid) {
		studReo.deleteById(sid);
		return "deletesuccess";

	}

	@RequestMapping("/getstudents")
	public String getAllStudents(Model model) {
		List<Student> list = (List<Student>) studReo.findAll();
		model.addAttribute("students", list);
		return "getallstudents";

	}

	@RequestMapping("/getstudent")
	public String getStudent() {
		return "getstudent";

	}
	
	@RequestMapping("/displaystudent")
	public String displayStudent(@RequestParam("sid") int id, Model model) {
		Student st = studReo.findById(id).get();
		model.addAttribute("student",st);
		return "displaystudent";
		
		
	}
}
