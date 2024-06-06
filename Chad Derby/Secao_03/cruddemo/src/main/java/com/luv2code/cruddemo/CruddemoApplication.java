package com.luv2code.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->  createMultipleStudents(studentDAO);  //createStudent(studentDAO);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
		// save the student object
		System.out.println("Savind the student...");
		studentDAO.save(tempStudent);
		// display the id of the saved student
		System.out.println("Saved student. Generated id " + tempStudent.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// creatING 3 studentS object
		System.out.println("Creating new studentS objectS...");
		Student tempStudent1 = new Student("Mary", "Public", "mury@luv2code.com");
		Student tempStudent2 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebun", "bonita@luv2code.com");
		// save the student object
		System.out.println("Savind the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		// display the id of the saved student
		System.out.println("Saved student. Generated id " + tempStudent1.getId());
		System.out.println("Saved student. Generated id " + tempStudent2.getId());
		System.out.println("Saved student. Generated id " + tempStudent3.getId());
	}
}
