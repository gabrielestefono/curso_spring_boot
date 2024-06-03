package com.luv2code.springcoredemo.rest;

import org.springframework.web.bind.annotation.RestController;

import com.luv2code.util.Coach;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
	private final Coach myCoach;

	public DemoController(Coach myCoach) {
		this.myCoach = myCoach;
	}

	@GetMapping("/dailyworkout")
	public String getMethodName() {
		return this.myCoach.getDailyWorkOut();
	}
}
