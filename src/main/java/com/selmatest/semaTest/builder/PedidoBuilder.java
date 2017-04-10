package com.selmatest.semaTest.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.Produto;
import com.selmatest.semaTest.domain.Vendedor;

public class PedidoBuilder {

    private int id = new Random().nextInt(10);
    private Cliente cliente = new ClienteBuilder().build();
    private Vendedor vendedor =  new VendedorBuilder().build();
    private List<Produto> produtos = Arrays.asList(new ProdutoBuilder().build());
    private Endereco enderecoEntrega = new EnderecoBuilder().build();

    public PedidoBuilder() {
        super();
    }

    public PedidoBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public PedidoBuilder withCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder withVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public PedidoBuilder withProdutos(List<Produto> produtos) {
        this.produtos = produtos;
        return this;
    }

    public PedidoBuilder withEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        return this;
    }

    public Pedido build() {
        return new Pedido(id, cliente, vendedor, produtos, enderecoEntrega);
    }

}
