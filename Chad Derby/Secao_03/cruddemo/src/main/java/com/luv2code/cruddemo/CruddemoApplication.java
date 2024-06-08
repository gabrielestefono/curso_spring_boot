package com.luv2code.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {
	private static final String SHOWSTUDENT = "Saved student. Generated id ";
	private static final String APPLEBUM = "Saved student. Generated id ";

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return (String[] args) ->  {
		createMultipleStudents(studentDAO);
		createStudent(studentDAO);
		readStudent(studentDAO);
		queryForStudent(studentDAO);
		queryForStudentByLastName(studentDAO);
		};
	}

	private static void createStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
		// save the student object
		System.out.println("Savind the student...");
		studentDAO.save(tempStudent);
		// display the id of the saved student
		System.out.println(SHOWSTUDENT + tempStudent.getId());
	}

	private static void createMultipleStudents(StudentDAO studentDAO) {
		// creatING 3 studentS object
		System.out.println("Creating new students objects...");
		Student tempStudent1 = new Student("Mary", "Public", "mury@luv2code.com");
		Student tempStudent2 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent3 = new Student("Bonita", APPLEBUM, "bonita@luv2code.com");
		// save the student object
		System.out.println("Savind the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		// display the id of the saved student
		System.out.println(SHOWSTUDENT + tempStudent1.getId());
		System.out.println(SHOWSTUDENT + tempStudent2.getId());
		System.out.println(SHOWSTUDENT + tempStudent3.getId());
	}

	private static void readStudent(StudentDAO studentDAO) {
		// Create a Student Object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Macarena", APPLEBUM, "macarena@luv2code.com");

		// Save the Student
		System.out.println("Savind the students...");
		studentDAO.save(tempStudent);

		// Display id of the saved Student
		System.out.println(SHOWSTUDENT + tempStudent.getId());

		// Display Student
		Student foundStudent = studentDAO.findbyId(tempStudent.getId());
		System.out.println(foundStudent.toString());
	}

	private static void queryForStudent(StudentDAO studentDAO) {
		// get a list of Student
		List<Student> theStudents = studentDAO.findAll();

		// display the list of students
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}

	private static void queryForStudentByLastName(StudentDAO studentDAO) {
		// Get a list of Students
		List<Student> theStudents = studentDAO.findByLastName(APPLEBUM);
		
		// Display list of Students
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}
}
