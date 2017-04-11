package com.selmatest.semaTest.domain;

import com.selmatest.semaTest.domain.Carro.CarroBuilder;

import lombok.Builder;

@Builder
public class EnderecoDTO {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
