package com.luv2code.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.luv2code.thymeleafdemo.model.Student;


@Controller
public class StudentController {
	@Value("${countries}")
	private List<String> countries;

	@Value("${language}")
	private List<String> language;

	@Value("${operationalsystem}")
	private List<String> operationalSystem;

	public StudentController() {
		// A
	}
	
	@GetMapping("/show-student-form")
	public String showForm(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("countries", countries);
		model.addAttribute("language", language);
		model.addAttribute("operationalSystem", operationalSystem);
		return "student-form";
	}

	@PostMapping("/process-student-form")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-confirmation";
	}
}
