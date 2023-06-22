package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class HomeController {

	// handler methods 
	@RequestMapping("/message")
	@ResponseBody
	public String getMessage() {
		
		return "Good Afternoon";
	}
	
	@RequestMapping("/home")
	public String getHome(Model model) {
		System.out.println("getHome Method Called");
		model.addAttribute("student","John");
		model.addAttribute("id","102");
		List<String> cities = new ArrayList();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Chennai");
		model.addAttribute("cities",cities);		
		return "home";
	}
	
	@RequestMapping("/course")
	public ModelAndView courses() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("dept","IT");
		List<String> courses = new ArrayList();
		courses.add("C#");
		courses.add("Java");
		courses.add("HTMl");
		mv.addObject("crs", courses);
		mv.setViewName("courses");
		return mv;
	}
	
}
