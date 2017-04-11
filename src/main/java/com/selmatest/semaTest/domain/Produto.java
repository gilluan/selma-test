package com.selmatest.semaTest.domain;

import java.math.BigDecimal;

import lombok.Builder;


@Builder
public class Produto {

    private Integer id;
    private String descricao;
    private BigDecimal preco;
    private Fornecedor fornecedor;
    private GrupoEnum grupo;

    public Produto() {
        super();
    }

    public Produto(Integer id, String descricao, BigDecimal preco, Fornecedor fornecedor, GrupoEnum grupo) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.grupo = grupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public GrupoEnum getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoEnum grupo) {
        this.grupo = grupo;
    }

}
