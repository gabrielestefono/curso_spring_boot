package com.tabuada.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TabuadaController {

	@GetMapping("/soma/{numero}")
	public List<String> soma(@PathVariable Integer numero) {
		List<String> tabuada = new ArrayList<>();
		for(int i = 0; i < 11; i++){
			tabuada.add(numero + " + " + i +" = " + (numero + i));
		}
		return tabuada;
	}

	@GetMapping("/subtracao/{numero}")
	public List<String> subtracao(@PathVariable Integer numero) {
		List<String> tabuada = new ArrayList<>();
		for(int i = 0; i < 11; i++){
			tabuada.add(numero + " - " + i +" = " + (numero - i));
		}
		return tabuada;
	}

	@GetMapping("/multiplicacao/{numero}")
	public List<String> multiplicacao(@PathVariable Integer numero) {
		List<String> tabuada = new ArrayList<>();
		for(int i = 0; i < 11; i++){
			tabuada.add(numero + " * " + i +" = " + (numero * i));
		}
		return tabuada;
	}

	@GetMapping("/divisao/{numero}")
	public List<String> divisao(@PathVariable Integer numero) {
		List<String> tabuada = new ArrayList<>();
		for(int i = 0; i < 11; i++){
			if(i == 0){
				continue;
			}
			tabuada.add(numero + " / " + i +" = " + (numero / i));
		}
		return tabuada;
	}
}
