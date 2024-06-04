package com.classificadornotas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClassificatorController {

	@GetMapping("/nota/{nota}")
	public String classificarNota(@PathVariable Integer nota) {
		if(nota >= 90){
			return "A";
		}else if(nota > 80){
			return "B";
		}else if(nota > 70){
			return "C";
		}else if(nota > 60){
			return "D";
		}else{
			return "F";
		}
	}
}
