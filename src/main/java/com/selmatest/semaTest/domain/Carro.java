package com.selmatest.semaTest.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Carro {

	@Getter
    private String marca;
	@Getter
    private Integer ano;
	@Getter
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
    
    public Carro(String marca, String nomeComercial) {
    	super();
    	this.marca = marca;
    	this.nomeComercial = nomeComercial;
    }
    
}
