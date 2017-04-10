package com.selmatest.semaTest.domain;

import java.util.List;

public class Cliente extends Pessoa {

    private String observacao;

    public Cliente() {
        super();
    }

    public Cliente(String nome, Integer idade, List<String> apelidos, List<Telefone> telefones, Endereco endereco,
            String observacao) {
        super(nome, idade, apelidos, telefones, endereco);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
