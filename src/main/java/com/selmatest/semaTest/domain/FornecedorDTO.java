package com.selmatest.semaTest.domain;

public class FornecedorDTO {

    private Integer id;
    private String nome;
    private String cnpj;
    private EnderecoDTO endereco;

    public FornecedorDTO() {
        super();
    }

    public FornecedorDTO(Integer id, String nome, String cnpj, EnderecoDTO endereco) {
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

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }

}
