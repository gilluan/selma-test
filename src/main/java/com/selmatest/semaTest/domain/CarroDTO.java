package com.selmatest.semaTest.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CarroDTO {

	@Getter @Setter
    private String marca;

	@Getter @Setter
    private String modelo;

    public CarroDTO() {
        super();
    }

    public CarroDTO(String marca, String modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

}
