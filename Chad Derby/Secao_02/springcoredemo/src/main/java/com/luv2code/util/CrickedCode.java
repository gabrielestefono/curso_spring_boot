package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CrickedCode implements Coach{

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes!";
	}
}
