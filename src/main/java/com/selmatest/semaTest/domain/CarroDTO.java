package com.selmatest.semaTest.domain;

import com.selmatest.semaTest.domain.Carro.CarroBuilder;

import lombok.Builder;

@Builder
public class CarroDTO {

    private String marca;

    private String modelo;

    public CarroDTO() {
        super();
    }

    public CarroDTO(String marca, String modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
