package com.luv2code.sopringcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CrickedCode implements Coach{

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes!";
	}
}
