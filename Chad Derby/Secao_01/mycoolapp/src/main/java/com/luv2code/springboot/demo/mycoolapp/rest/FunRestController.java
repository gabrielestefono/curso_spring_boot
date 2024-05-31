package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {
	// Properties from application.properties

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;


	/**
	 * Expose a "/" that returns a "Hello World!"
	 * @return String
	 */
	@GetMapping
	public String sayHello() {
		return "Hello World!";
	}

	/**
	 * Exporse a new endpoinst for workout
	 * @return String
	 */
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	/**
	 * Exporse a new endpoinst for fortune
	 * @return String
	 */
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Tokay is your lucky day!";
	}

	@GetMapping("/teaminfo")
	public String teamInfo() {
		return "Coach name: " + coachName + " Team name: " + teamName;
	}
}
