package com.selmatest.semaTest.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Telefone;

public class ClienteBuilder {
    
    private String nome = "nome default";
    private Integer idade = new Random().nextInt(10);
    private List<String> apelidos = Arrays.asList("xpto", "zoiudo");
    private List<Telefone> telefones = Arrays.asList(new TelefoneBuilder().build());
    private Endereco endereco = new EnderecoBuilder().build();
    private String observacao = "observacao teste";
    
    public ClienteBuilder withNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    public ClienteBuilder withIdade(Integer idade) {
        this.idade = idade;
        return this;
    }
    
    public ClienteBuilder withApelidos(List<String> apelidos) {
        this.apelidos = apelidos;
        return this;
    }
    
    public ClienteBuilder withTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
        return this;
    }
    
    public ClienteBuilder withEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public ClienteBuilder withObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }
    public Cliente build() {
        return new Cliente(nome, idade, apelidos, telefones, endereco, observacao);
    }

}
