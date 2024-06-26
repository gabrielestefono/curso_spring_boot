package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;



@RestController
public class DemoController {
	private final Coach myCoach;

	public DemoController(@Qualifier("aquatic") Coach myCoach) {
		System.out.println("In constructor: " + getClass().getSimpleName());
		this.myCoach = myCoach;
	}

	@GetMapping("/dailyworkout")
	public String getMethodName() {
		return this.myCoach.getDailyWorkOut();
	}
}
