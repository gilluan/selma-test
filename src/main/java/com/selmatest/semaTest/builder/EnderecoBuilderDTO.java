package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.EnderecoDTO;

public class EnderecoBuilderDTO {

    private String logradouro = "logradouro exemplo";
    private String bairro = "bairro exemplo";
    private String cep = "11111111";
    private String numero = "11";
    private String complemento = "complemento exemplo";

    public EnderecoBuilderDTO withLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public EnderecoBuilderDTO withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilderDTO withCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilderDTO withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilderDTO withComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public EnderecoDTO build() {
        return new EnderecoDTO(logradouro, bairro, cep, numero, complemento);
    }

}
