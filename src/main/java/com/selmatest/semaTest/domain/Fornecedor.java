package com.selmatest.semaTest.domain;

import lombok.Builder;

@Builder
public class Fornecedor {

    private Integer id;
    private String nome;
    private String cnpj;
    private Endereco endereco;

    public Fornecedor() {
        super();
    }

    public Fornecedor(Integer id, String nome, String cnpj, Endereco endereco) {
        super();
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
