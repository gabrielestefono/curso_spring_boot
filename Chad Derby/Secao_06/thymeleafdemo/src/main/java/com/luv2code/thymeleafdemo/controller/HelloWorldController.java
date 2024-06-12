package com.luv2code.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	public final String FORMPAGE = "helloworld-form";
	
	@GetMapping("/show-form")
	public String showForm(){
		return FORMPAGE;
	}

	@GetMapping("/process-form")
	public String processForm(Model theModel, @RequestParam String studentName){
		theModel.addAttribute("name", studentName);
		return FORMPAGE;
	}

	@GetMapping("/process-form-version-two")
	public String letsShoutDude(HttpServletRequest request, Model model){
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo! " + theName;
		model.addAttribute("message", result);
		return FORMPAGE;
	}

	@PostMapping("/process-form-version-tree")
	public String processForm(@RequestParam("studentName") String theName ,Model model){
		theName = theName.toUpperCase();
		String result = "Hey my frient from v3! " + theName;
		model.addAttribute("message", result);
		return FORMPAGE;
	}
}
