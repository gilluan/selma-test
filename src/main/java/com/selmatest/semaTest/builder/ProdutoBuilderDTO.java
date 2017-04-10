package com.selmatest.semaTest.builder;

import java.math.BigDecimal;
import java.util.Random;

import com.selmatest.semaTest.domain.Fornecedor;
import com.selmatest.semaTest.domain.FornecedorDTO;
import com.selmatest.semaTest.domain.GrupoEnum;
import com.selmatest.semaTest.domain.Produto;
import com.selmatest.semaTest.domain.ProdutoDTO;

public class ProdutoBuilderDTO {
    
    private Integer id = new Random().nextInt(10);
    private String descricao = "descricao default";
    private BigDecimal preco = BigDecimal.ZERO;
    private FornecedorDTO fornecedor = new FornecedorBuilderDTO().build();
    private GrupoEnum grupo = GrupoEnum.VAREJO;
    
    public ProdutoBuilderDTO withId(Integer id) {
        this.id = id;
        return this;
    }
    
    public ProdutoBuilderDTO withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    
    public ProdutoBuilderDTO withPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }
    
    public ProdutoBuilderDTO withFornecedor(FornecedorDTO fornecedor) {
        this.fornecedor = fornecedor;
        return this;
    }
    
    public ProdutoBuilderDTO withGrupo(GrupoEnum grupo) {
        this.grupo = grupo;
        return this;
    }

    public ProdutoDTO build() {
        return new ProdutoDTO(id, descricao, preco, fornecedor, grupo);
    }

}
