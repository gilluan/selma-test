package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TipoTelefoneEnum;

public class TelefoneBuilder {
    
    private String numero;
    private TipoTelefoneEnum tipo;
    private String ddd;
    
    public TelefoneBuilder withNumero(String numero) {
        this.numero = numero;
        return this;
    }
    
    public TelefoneBuilder withTipoTelefone(TipoTelefoneEnum tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public TelefoneBuilder withDdd(String ddd) {
        this.ddd = ddd;
        return this;
    }

    public Telefone build() {
        return new Telefone(numero, tipo, ddd);
    }

}
