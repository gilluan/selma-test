package com.selmatest.semaTest.domain;

import lombok.Builder;

@Builder
public class ClasseB {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
