package com.selmatest.semaTest.builder;

import java.math.BigDecimal;

import com.selmatest.semaTest.domain.Fornecedor;
import com.selmatest.semaTest.domain.GrupoEnum;
import com.selmatest.semaTest.domain.Produto;

public class ProdutoBuilder {
    
    private Integer id;
    private String descricao;
    private BigDecimal preco;
    private Fornecedor fornecedor;
    private GrupoEnum grupo;
    
    public ProdutoBuilder withId(Integer id) {
        this.id = id;
        return this;
    }
    
    public ProdutoBuilder withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    
    public ProdutoBuilder withPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }
    
    public ProdutoBuilder withFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        return this;
    }
    
    public ProdutoBuilder withGrupo(GrupoEnum grupo) {
        this.grupo = grupo;
        return this;
    }

    public Produto build() {
        return new Produto(id, descricao, preco, fornecedor, grupo);
    }

}
