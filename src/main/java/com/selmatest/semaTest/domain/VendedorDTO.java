package com.selmatest.semaTest.domain;

import java.util.Date;

public class VendedorDTO {

    private String matricula;
    private Date nascimento;

    public VendedorDTO(String matricula, Date nascimento) {
        super();
        this.matricula = matricula;
        this.nascimento = nascimento;
    }

    public VendedorDTO() {
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
