package com.selmatest.semaTest.domain;

import lombok.Builder;

@Builder
public class ClasseA {
	
	private String nome;
	private ClasseB b;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ClasseB getB() {
		return b;
	}

	public void setB(ClasseB b) {
		this.b = b;
	}
	
	
	

}
