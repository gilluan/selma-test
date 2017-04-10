package com.selmatest.semaTest.domain;

import java.util.Date;
import java.util.List;

public class Vendedor extends Pessoa {

    private String matricula;
    private Date nascimento;
    
    public Vendedor(String nome, Integer idade, List<String> apelidos, List<Telefone> telefones, Endereco endereco,
            String matricula, Date nascimento) {
        super(nome, idade, apelidos, telefones, endereco);
        this.matricula = matricula;
        this.nascimento = nascimento;
    }

    public Vendedor() {
        super();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
