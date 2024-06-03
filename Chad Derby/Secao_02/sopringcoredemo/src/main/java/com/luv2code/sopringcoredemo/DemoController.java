package com.luv2code.sopringcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
	private final Coach myCoach;

	@Autowired // Não necessário
	public DemoController(Coach myCoach) {
		this.myCoach = myCoach;
	}

	@GetMapping("/dailyworkout")
	public String getMethodName() {
		return this.myCoach.getDailyWorkOut();
	}
}
