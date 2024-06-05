package com.tabuada.controllers;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TabuadaControllerTest{

	@Autowired
	TabuadaController tabuadaController;

	@Test
	void testShouldReturnString(){
		int[] meuArray = new int[10];
		for (int i : meuArray) {
			assertTrue("String".equals(this.tabuadaController.soma(i).get(0).getClass().getSimpleName()), "Sucesso!");
			assertTrue("String".equals(this.tabuadaController.subtracao(i).get(0).getClass().getSimpleName()), "Sucesso!");
			assertTrue("String".equals(this.tabuadaController.multiplicacao(i).get(0).getClass().getSimpleName()), "Sucesso!");
			assertTrue("String".equals(this.tabuadaController.divisao(i).get(0).getClass().getSimpleName()), "Sucesso!");
		}
	}
}
