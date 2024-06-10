package com.gerenciadorestudantes.estudante.models.eao;

public class Estudante {
	private String nome;

	private Integer idade;

	private Double nota;

	public Estudante(String nome, Integer idade, Double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
}
