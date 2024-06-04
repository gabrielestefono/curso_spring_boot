package com.calculadora.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.dto.Recebimento;
import com.calculadora.errors.error.BadRequest;


@RestController
public class CalcController {

	@GetMapping("/soma")
	public Double somar(@ModelAttribute Recebimento numeros) {
		return numeros.numero1() + numeros.numero2();
	}

	@GetMapping("/subtracao")
	public Double subtrair(@ModelAttribute Recebimento numeros) {
		return numeros.numero1() - numeros.numero2();
	}

	@GetMapping("/multiplicacao")
	public Double multiplicar(@ModelAttribute Recebimento numeros) {
		return numeros.numero1() * numeros.numero2();
	}

	@GetMapping("/divisao")
	public Double dividir(@ModelAttribute Recebimento numeros) {
		double epsilon = 1E-10;
		if (Math.abs(numeros.numero2() - 0.0) < epsilon) {
			throw new BadRequest("Não existe divisão por 0");
		}
		return numeros.numero1() / numeros.numero2();
	}
}
