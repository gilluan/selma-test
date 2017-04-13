package com.selmatest.semaTest.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Endereco {
	@Getter @Setter
    private String logradouro;
	@Getter @Setter
    private String bairro;
	@Getter @Setter
    private String cep;
	@Getter @Setter
    private String numero;
	@Getter @Setter
    private String complemento;

    public Endereco() {
        super();
    }

    public Endereco(String logradouro, String bairro, String cep, String numero, String complemento) {
        super();
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

}
