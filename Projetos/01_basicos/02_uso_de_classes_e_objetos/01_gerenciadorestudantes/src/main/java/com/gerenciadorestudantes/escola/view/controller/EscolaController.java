package com.gerenciadorestudantes.escola.view.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadorestudantes.estudante.models.eao.Estudante;
import com.gerenciadorestudantes.turma.models.eao.Turma;


@RestController
public class EscolaController {
	private List<Turma> turmas = new ArrayList<>();

	private int contador;

	public EscolaController() {
		// Empty
	}

	@GetMapping(path = "/")
	public List<Turma> todasTurmas() {
		return this.turmas;
	}

	@PostMapping(path = "/")
	public Turma criarTurma() {
		Turma turma = new Turma(this.contador);
		this.contador += 1;
		this.turmas.add(turma);
		return turma;
	}

	@GetMapping(path = "/{id}")
	public Turma turma(@PathVariable int id) {
		if(id > this.contador || id < 0){
			throw new IllegalArgumentException("Id não existe!");
		}
		Turma turmaCorreta = null;
		boolean encontrou = false;
		for (Turma turma : turmas){
			if(turma.getId() == id){
				turmaCorreta = turma;
				encontrou = true;
				break;
			}
		}
		if(!encontrou){
			throw new IllegalArgumentException("Id não existe!");
		}
		return turmaCorreta;
	}

	@DeleteMapping(path = "/{id}")
	public void deleteTurma(@PathVariable int id){
		this.turma(id);
		this.turmas.remove(id);
	}

	@PostMapping("turma/{id}")
	public Estudante adicionarEstudante(@RequestBody Estudante estudante, @PathVariable int id) {
		Turma turma = this.turma(id);
		List<Estudante> estudantes = turma.getEstudantes();
		estudantes.add(estudante);
		return estudante;
	}

	@DeleteMapping("turma/{id}/{nome}")
	public void removerEstudante(@PathVariable String nome, @PathVariable int id) {
		Turma turma = this.turma(id);
		List<Estudante> estudantes = turma.getEstudantes();
		boolean existe = false;
		for (Estudante estudante : estudantes) {
			if(nome.equals(estudante.getNome())){
				estudantes.remove(estudante);
				existe = true;
				break;
			}
		}
		if(!existe){
			throw new IllegalArgumentException("Id não existe!");
		}
	}
}
