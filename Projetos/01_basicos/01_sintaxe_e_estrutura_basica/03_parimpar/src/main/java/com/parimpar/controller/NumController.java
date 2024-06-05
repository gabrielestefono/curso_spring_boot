package com.parimpar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NumController {
	@GetMapping("/parimpar/{numero}")
	public String getMethodName(@PathVariable Integer numero) {
		return numero % 2 == 0 ? "Par" : "Impar";
	}
}
