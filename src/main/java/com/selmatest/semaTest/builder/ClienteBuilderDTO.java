package com.selmatest.semaTest.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.selmatest.semaTest.domain.ClienteDTO;
import com.selmatest.semaTest.domain.EnderecoDTO;
import com.selmatest.semaTest.domain.TelefoneDTO;

public class ClienteBuilderDTO {
    
    private String nome = "nome default";
    private Integer idade = new Random().nextInt(10);
    private List<String> apelidos = Arrays.asList("xpto", "zoiudo");
    private List<TelefoneDTO> telefones = Arrays.asList(new TelefoneBuilderDTO().build());
    private EnderecoDTO endereco = new EnderecoBuilderDTO().build();
    private String observacao = "observacao teste";
    
    public ClienteBuilderDTO withNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    public ClienteBuilderDTO withIdade(Integer idade) {
        this.idade = idade;
        return this;
    }
    
    public ClienteBuilderDTO withApelidos(List<String> apelidos) {
        this.apelidos = apelidos;
        return this;
    }
    
    public ClienteBuilderDTO withTelefones(List<TelefoneDTO> telefones) {
        this.telefones = telefones;
        return this;
    }
    
    public ClienteBuilderDTO withEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
        return this;
    }

    public ClienteBuilderDTO withObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }
    public ClienteDTO build() {
        return new ClienteDTO(nome, idade, apelidos, telefones, observacao);
    }

}
