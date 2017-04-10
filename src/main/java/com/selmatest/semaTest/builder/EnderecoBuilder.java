package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.Endereco;

public class EnderecoBuilder {

    private String logradouro = "logradouro exemplo";
    private String bairro = "bairro exemplo";
    private String cep = "11111111";
    private String numero = "11";
    private String complemento = "complemento exemplo";

    public EnderecoBuilder withLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public EnderecoBuilder withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder withCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder withComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Endereco build() {
        return new Endereco(logradouro, bairro, cep, numero, complemento);
    }

}
