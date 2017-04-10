package com.selmatest.semaTest.domain;

public class Telefone {

    private String numero;
    private TipoTelefoneEnum tipo;
    private String ddd;

    public Telefone() {
        super();
    }

    public Telefone(String numero, TipoTelefoneEnum tipo, String ddd) {
        super();
        this.numero = numero;
        this.tipo = tipo;
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public TipoTelefoneEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefoneEnum tipo) {
        
        this.tipo = tipo;
    }
}
