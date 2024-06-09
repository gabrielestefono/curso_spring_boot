package com.luv2code.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.luv2code.demo.entity.Student;


@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getMethodName() {
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("Poornia", "Patel"));
		theStudents.add(new Student("Maria", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));
		return theStudents;
	}
}
