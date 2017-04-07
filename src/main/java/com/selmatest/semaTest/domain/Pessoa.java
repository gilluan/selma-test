package com.selmatest.semaTest.domain;

import java.util.List;

public class Pessoa {

	private String nome;
	private Integer idade;
	private List<String> apelidos;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, Integer idade, List<String> apelidos) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.apelidos = apelidos;
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

	public List<String> getApelidos() {
		return apelidos;
	}

	public void setApelidos(List<String> apelidos) {
		this.apelidos = apelidos;
	}

}
