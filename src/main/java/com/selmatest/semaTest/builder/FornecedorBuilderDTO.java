package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.EnderecoDTO;
import com.selmatest.semaTest.domain.FornecedorDTO;

public class FornecedorBuilderDTO {
    
    private Integer id;
    private String nome;
    private String cnpj;
    private EnderecoDTO endereco = new EnderecoBuilderDTO().build();
    
    
    public FornecedorBuilderDTO withId(Integer id) {
        this.id = id;
        return this;
    }
    
    public FornecedorBuilderDTO withNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    public FornecedorBuilderDTO withCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public FornecedorBuilderDTO withEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
        return this;
    }
    

    public FornecedorDTO build() {
        return new FornecedorDTO(id, nome, cnpj, endereco);
    }

}
