package com.selmatest.semaTest.domain;

import java.util.List;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;


public class ClienteDTO extends PessoaDTO {

	@Getter @Setter
    private String observacao;
    
    public ClienteDTO() {
        super();
    }
    
    @Builder
    public ClienteDTO(String nome, Integer idade, List<String> apelidos, List<TelefoneDTO> telefones,
            String observacao) {
        super(nome, idade, apelidos, telefones);
        this.observacao = observacao;
    }
    
}
