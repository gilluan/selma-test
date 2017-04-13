package com.selmatest.semaTest.domain;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;

@Builder
public class EnderecoDTO {

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

    public EnderecoDTO() {
        super();
    }

    public EnderecoDTO(String logradouro, String bairro, String cep, String numero, String complemento) {
        super();
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

}
