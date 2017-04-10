package com.selmatest.semaTest.builder;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.Vendedor;

public class VendedorBuilder {

    private String nome = "nome default";
    private Integer idade = new Random().nextInt(50);
    private List<String> apelidos = Arrays.asList("apelido 1");
    private List<Telefone> telefones = Arrays.asList(new TelefoneBuilder().build());
    private Endereco endereco = new EnderecoBuilder().build();
    private String matricula = "123abc";
    private Date nascimento = new Date();

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
