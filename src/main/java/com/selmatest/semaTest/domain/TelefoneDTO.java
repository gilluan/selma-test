package com.selmatest.semaTest.domain;

import lombok.Builder;

@Builder
public class TelefoneDTO {

    private String numero;
    private TipoTelefoneEnum tipo;

    public TelefoneDTO() {
        super();
    }

    public TelefoneDTO(String numero, TipoTelefoneEnum tipo) {
        super();
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefoneEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefoneEnum tipo) {
        this.tipo = tipo;
    }
}
