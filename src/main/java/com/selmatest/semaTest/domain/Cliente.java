package com.selmatest.semaTest.domain;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class Cliente extends Pessoa {
	
	@Getter @Setter
    private String observacao;

    public Cliente() {
        super();
    }

    @Builder
    public Cliente(String nome, Integer idade, List<String> apelidos, List<Telefone> telefones, Endereco endereco,
            String observacao) {
        super(nome, idade, apelidos, telefones, endereco);
        this.observacao = observacao;
    }
    
}
