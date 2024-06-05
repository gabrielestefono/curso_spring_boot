package com.conversortemperatura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConversorController {
	@GetMapping("/celcius2kelvin")
	public Double celciusToKelvin(@RequestParam Double celcius){
		return celcius + 273.15;
	}

	@GetMapping("/celcius2fahrenheit")
	public Double celciusToFahrenheit(@RequestParam Double celcius){
		return ((celcius * 9)/5) + 32;
	}

	@GetMapping("/kelvin2celcius")
	public Double kelvinToCelcius(@RequestParam Double kelvin) {
		return kelvin - 273.15;
	}

	@GetMapping("/kelvin2fahrenheit")
	public Double kelvinToFahrenheit(@RequestParam Double kelvin) {
		return (((kelvin - 273.15) * 9) / 5) + 32;
	}

	@GetMapping("/fahrenheit2celcius")
	public Double fahrenheitToCelcius(@RequestParam Double fahrenheit) {
		return ((fahrenheit - 32) * 5) / 9;
	}

	@GetMapping("/fahrenheit2kelvin")
	public Double fahrenheitToKelvin(@RequestParam Double fahrenheit) {
		return (((fahrenheit - 32) * 5) / 9) + 273.15;
	}
}
