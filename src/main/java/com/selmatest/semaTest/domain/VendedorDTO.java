package com.selmatest.semaTest.domain;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Getter;



public class VendedorDTO extends PessoaDTO {

    @Getter private String matricula;
    @Getter private Date nascimento;

    @Builder
    public VendedorDTO(String nome, Integer idade, List<String> apelidos, List<TelefoneDTO> telefones, String matricula,
            Date nascimento) {
        super(nome, idade, apelidos, telefones);
        this.matricula = matricula;
        this.nascimento = nascimento;
    }

    public VendedorDTO() {
        super();
    }

   

}
