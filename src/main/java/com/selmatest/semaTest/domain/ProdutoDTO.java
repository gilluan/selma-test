package com.selmatest.semaTest.domain;

import java.math.BigDecimal;

public class ProdutoDTO {

    private Integer id;
    private String descricao;
    private BigDecimal preco;
    private FornecedorDTO fornecedor;
    private GrupoEnum grupo;

    public ProdutoDTO() {
        super();
    }

    public ProdutoDTO(Integer id, String descricao, BigDecimal preco, FornecedorDTO fornecedor, GrupoEnum grupo) {
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
    
    public FornecedorDTO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorDTO fornecedor) {
        this.fornecedor = fornecedor;
    }

    public GrupoEnum getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoEnum grupo) {
        this.grupo = grupo;
    }

}
