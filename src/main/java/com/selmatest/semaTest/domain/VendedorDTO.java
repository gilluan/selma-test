package com.selmatest.semaTest.domain;

import java.util.Date;
import java.util.List;

public class VendedorDTO extends PessoaDTO{

    private String matricula;
    private Date nascimento;

    public VendedorDTO(String nome, Integer idade, List<String> apelidos, List<TelefoneDTO> telefones, String matricula,
            Date nascimento) {
        super(nome, idade, apelidos, telefones);
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
