package com.gerenciadorestudantes.turma.models.eao;

import java.util.ArrayList;
import java.util.List;

import com.gerenciadorestudantes.estudante.models.eao.Estudante;

public class Turma {
	private List<Estudante> estudantes = new ArrayList<>();

	private final Integer id;

	public Turma(Integer id) {
		this.id = id;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public Integer getId() {
		return id;
	}
}
