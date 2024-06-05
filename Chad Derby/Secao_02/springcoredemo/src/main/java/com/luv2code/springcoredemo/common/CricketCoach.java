package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
	public CricketCoach(){
		System.out.println("In constructor " + getClass().getSimpleName());
	}

	// Define our init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
	}

	// Define our destroy method
	@PreDestroy
	public void doMyCleanStuff(){
		System.out.println("In doMyCleanStuff(): " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 20 minutes!";
	}
}
