package com.luv2code.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.demo.entity.Student;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	
	@PostConstruct
	public void loadData(){
		this.theStudents = new ArrayList<>();
		this.theStudents.add(new Student("Poornia", "Patel"));
		this.theStudents.add(new Student("Maria", "Rossi"));
		this.theStudents.add(new Student("Mary", "Smith"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return theStudents;
	}

	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		if(studentId >= theStudents.size() || studentId < 0){
			throw new StudentNotFoundException("Student id not found!");
		}
		return this.theStudents.get(studentId);
	}
}
