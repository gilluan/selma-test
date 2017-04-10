package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.TelefoneDTO;
import com.selmatest.semaTest.domain.TipoTelefoneEnum;

public class TelefoneBuilderDTO {
    
    private String numero = "1111111111";
    private TipoTelefoneEnum tipo = TipoTelefoneEnum.TRABALHO;
    private String ddd = "61";
    
    public TelefoneBuilderDTO withNumero(String numero) {
        this.numero = numero;
        return this;
    }
    
    public TelefoneBuilderDTO withTipoTelefone(TipoTelefoneEnum tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public TelefoneBuilderDTO withDdd(String ddd) {
        this.ddd = ddd;
        return this;
    }

    public TelefoneDTO build() {
        return new TelefoneDTO(numero, tipo);
    }

}
