package com.selmatest.semaTest.domain;

import java.util.List;

public class ClienteDTO extends PessoaDTO {
    
    private String observacao;
    
    public ClienteDTO() {
        super();
    }
    
    public ClienteDTO(String nome, Integer idade, List<String> apelidos, List<TelefoneDTO> telefones,
            String observacao) {
        super(nome, idade, apelidos, telefones);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
