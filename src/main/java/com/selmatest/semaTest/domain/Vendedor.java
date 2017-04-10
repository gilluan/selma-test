package com.selmatest.semaTest.domain;

import java.util.Date;

public class Vendedor {

    private String matricula;
    private Date nascimento;

    public Vendedor(String matricula, Date nascimento) {
        super();
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
