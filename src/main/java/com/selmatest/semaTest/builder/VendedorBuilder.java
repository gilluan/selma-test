package com.selmatest.semaTest.builder;

import java.util.Date;
import java.util.List;

import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.Vendedor;

public class VendedorBuilder {

    private String nome;
    private Integer idade;
    private List<String> apelidos;
    private List<Telefone> telefones;
    private Endereco endereco;
    private String matricula;
    private Date nascimento;

    public VendedorBuilder withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public VendedorBuilder withIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public VendedorBuilder withApelidos(List<String> apelidos) {
        this.apelidos = apelidos;
        return this;
    }

    public VendedorBuilder withTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
        return this;
    }

    public VendedorBuilder withEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public VendedorBuilder withMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public VendedorBuilder withNascimento(Date nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    public Vendedor build() {
        return new Vendedor(nome, idade, apelidos, telefones, endereco, matricula, nascimento);
    }

}
