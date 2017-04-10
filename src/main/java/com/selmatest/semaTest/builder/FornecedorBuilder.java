package com.selmatest.semaTest.builder;

import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Fornecedor;

public class FornecedorBuilder {
    
    private Integer id;
    private String nome;
    private String cnpj;
    private Endereco endereco = new EnderecoBuilder().build();
    
    
    public FornecedorBuilder withId(Integer id) {
        this.id = id;
        return this;
    }
    
    public FornecedorBuilder withNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    public FornecedorBuilder withCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }
    
    public FornecedorBuilder withEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }
    

    public Fornecedor build() {
        return new Fornecedor(id, nome, cnpj, endereco);
    }

}
