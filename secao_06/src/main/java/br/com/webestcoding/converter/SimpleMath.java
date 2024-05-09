package br.com.webestcoding.converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SimpleMath {
	public static Double sum(
			@PathVariable("numberOne") Double numberOne,
			@PathVariable("numberTwo") Double numberTwo) {
		return numberOne + numberTwo;
	}

	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public static Double subtraction(
			@PathVariable("numberOne") Double numberOne,
			@PathVariable("numberTwo") Double numberTwo) {
		return numberOne - numberTwo;
	}

	@GetMapping("/division/{numberOne}/{numberTwo}")
	public static Double division(
			@PathVariable("numberOne") Double numberOne,
			@PathVariable("numberTwo") Double numberTwo) {
		return numberOne / numberTwo;
	}

	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public static Double multiplication(
			@PathVariable("numberOne") Double numberOne,
			@PathVariable("numberTwo") Double numberTwo) {
		return numberOne * numberTwo;
	}

	@GetMapping("/sqrt/{numberOne}")
	public static Double sqrt(
			@PathVariable("numberOne") Double numberOne) {
		return Math.sqrt(numberOne);
	}
}
