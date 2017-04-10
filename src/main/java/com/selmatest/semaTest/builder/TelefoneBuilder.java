package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TipoTelefoneEnum;

public class TelefoneBuilder {
    
    private String numero = "1111111111";
    private TipoTelefoneEnum tipo = TipoTelefoneEnum.TRABALHO;
    private String ddd = "61";
    
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
