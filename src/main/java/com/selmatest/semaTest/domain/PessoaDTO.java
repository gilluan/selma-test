package com.selmatest.semaTest.domain;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class PessoaDTO {

    private String nome;
    private Integer idade;
    private List<String> apelidos;
    private List<TelefoneDTO> telefones;

    protected PessoaDTO() {
        super();
    }

    public String getNome() {
        return nome;
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
