package com.selmatest.semaTest.domain;

import java.util.List;

public abstract class Pessoa {

    private String nome;
    private Integer idade;
    private List<String> apelidos;
    private List<Telefone> telefones;
    private Endereco endereco;

    protected Pessoa() {
        super();
    }

    protected Pessoa(String nome, Integer idade, List<String> apelidos, List<Telefone> telefones, Endereco endereco) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.apelidos = apelidos;
        this.telefones = telefones;
        this.endereco = endereco;
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

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
