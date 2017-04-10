package com.selmatest.semaTest.domain;

import java.util.List;

public abstract class PessoaDTO {

    private String nome;
    private Integer idade;
    private List<String> apelidos;
    private List<TelefoneDTO> telefones;

    protected PessoaDTO() {
        super();
    }

    protected PessoaDTO(String nome, Integer idade, List<String> apelidos, List<TelefoneDTO> telefones) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.apelidos = apelidos;
        this.telefones = telefones;
    }
    
    

    public String getNome() {
        return nome;
    }

    public PessoaDTO(String nome, Integer idade, List<String> apelidos) {
    super();
    this.nome = nome;
    this.idade = idade;
    this.apelidos = apelidos;
}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<String> getApelidos() {
        return apelidos;
    }

    public void setApelidos(List<String> apelidos) {
        this.apelidos = apelidos;
    }

    public List<TelefoneDTO> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDTO> telefones) {
        this.telefones = telefones;
    }

}
