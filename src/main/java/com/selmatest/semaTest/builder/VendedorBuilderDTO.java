package com.selmatest.semaTest.builder;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.selmatest.semaTest.domain.EnderecoDTO;
import com.selmatest.semaTest.domain.TelefoneDTO;
import com.selmatest.semaTest.domain.VendedorDTO;

public class VendedorBuilderDTO {

    private String nome = "nome default";
    private Integer idade = new Random().nextInt(50);
    private List<String> apelidos = Arrays.asList("apelido 1");
    private List<TelefoneDTO> telefones = Arrays.asList(new TelefoneBuilderDTO().build());
    private EnderecoDTO endereco = new EnderecoBuilderDTO().build();
    private String matricula = "123abc";
    private Date nascimento = new Date();

    public VendedorBuilderDTO withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public VendedorBuilderDTO withIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public VendedorBuilderDTO withApelidos(List<String> apelidos) {
        this.apelidos = apelidos;
        return this;
    }

    public VendedorBuilderDTO withTelefones(List<TelefoneDTO> telefones) {
        this.telefones = telefones;
        return this;
    }

    public VendedorBuilderDTO withEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
        return this;
    }

    public VendedorBuilderDTO withMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public VendedorBuilderDTO withNascimento(Date nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    public VendedorDTO build() {
        return new VendedorDTO(nome, idade, apelidos, telefones, matricula, nascimento);
    }

}
