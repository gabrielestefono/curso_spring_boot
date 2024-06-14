package com.luv2code.springdemo.mvc.costumer;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
	private String firstName;

	@NotNull(message = "Is required")
	@Size(min = 1, message = "Is required")
	private String lastName;


	@Min(value = 0, message="Must be greater or equals zero")
	@Max(value = 10, message="Must be less than or equals to ten")
	@NotNull(message = "Is required")
	private Integer freePasses;

	@Pattern(regexp="^[a-zA-Z0-9]{8}", message="Only 5 char/digits")
	private String postalCode;

	@CourseCode
	private String courseCode;

	public Customer() {
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
