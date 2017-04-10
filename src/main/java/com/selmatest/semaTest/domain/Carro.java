package com.selmatest.semaTest.domain;

import lombok.Builder;

@Builder
public class Carro {
    
    private String marca;
    private Integer ano;
    private String nomeComercial;
    
    public Carro() {
        super();
    }


    public Carro(String marca, Integer ano, String nomeComercial) {
        super();
        this.marca = marca;
        this.ano = ano;
        this.nomeComercial = nomeComercial;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public Integer getAno() {
        return ano;
    }


    public void setAno(Integer ano) {
        this.ano = ano;
    }


    public String getNomeComercial() {
        return nomeComercial;
    }


    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }


    
}
