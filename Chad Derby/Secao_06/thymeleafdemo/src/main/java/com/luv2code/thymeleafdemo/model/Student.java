package com.luv2code.thymeleafdemo.model;


public class Student {
	private String firstName;

	private String lastName;

	private String country;

	private String language;

	private String operationalSystem;

	public Student() {
		// Empty Constructor
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOperationalSystem() {
		return operationalSystem;
	}

	public void setOperationalSystem(String operationalSystem) {
		this.operationalSystem = operationalSystem;
	}
}
