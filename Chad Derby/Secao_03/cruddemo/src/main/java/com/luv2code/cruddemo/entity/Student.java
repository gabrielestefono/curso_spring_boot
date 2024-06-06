package com.luv2code.cruddemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "student" )
public class Student {

	// Definindo campos
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String fisrtName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	// Definindo contructor
	public Student() {
	}
	
	public Student(String fisrtName, String lastName, String email) {
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.email = email;
	}


	// Definindo getters/setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	// Define toString method
	@Override
	public String toString() {
		return "Student [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
