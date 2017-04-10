package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.Endereco;

public class EnderecoBuilder {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;

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
