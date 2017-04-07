package com.selmatest.semaTest.domain;

public class TelefoneDTO {

    private String numero;
    private TipoTelefone tipo;

    public TelefoneDTO() {
        super();
    }

    public TelefoneDTO(String numero, TipoTelefone tipo) {
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

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }
}
