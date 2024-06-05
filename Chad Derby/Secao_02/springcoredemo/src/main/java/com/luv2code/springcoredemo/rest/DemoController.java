package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;



@RestController
public class DemoController {
	private final Coach myCoach;

	private final Coach anotherCoach;

	public DemoController(
			@Qualifier("cricketCoach") Coach myCoach,
			@Qualifier("cricketCoach") Coach anotherCoach
		) {
		System.out.println("In constructor: " + getClass().getSimpleName());
		this.myCoach = myCoach;
		this.anotherCoach = anotherCoach;
	}

	@GetMapping("/dailyworkout")
	public String getMethodName() {
		return this.myCoach.getDailyWorkOut();
	}

	@GetMapping("/check")
	public String check() {
		return "Comáring Beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
	}
	
}
