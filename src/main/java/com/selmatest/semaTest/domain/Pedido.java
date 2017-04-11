package com.selmatest.semaTest.domain;

import java.util.List;

import com.selmatest.semaTest.domain.Carro.CarroBuilder;

import lombok.Builder;


@Builder
public class Pedido {

    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos;
    private Endereco enderecoEntrega;

    public Pedido() {
        super();
    }

    public Pedido(int id, Cliente cliente, Vendedor vendedor, List<Produto> produtos, Endereco enderecoEntrega) {
        super();
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtos = produtos;
        this.enderecoEntrega = enderecoEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

}
