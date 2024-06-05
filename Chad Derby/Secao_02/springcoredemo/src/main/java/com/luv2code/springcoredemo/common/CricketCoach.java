package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
	public CricketCoach(){
		System.out.println("In constructor " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 20 minutes!";
	}
}
