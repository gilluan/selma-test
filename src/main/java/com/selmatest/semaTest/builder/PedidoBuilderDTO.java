package com.selmatest.semaTest.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;
import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.EnderecoDTO;
import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.PedidoDTO;
import com.selmatest.semaTest.domain.Produto;
import com.selmatest.semaTest.domain.ProdutoDTO;
import com.selmatest.semaTest.domain.Vendedor;
import com.selmatest.semaTest.domain.VendedorDTO;

public class PedidoBuilderDTO {

    private int id = new Random().nextInt(10);
    private ClienteDTO cliente = new ClienteBuilderDTO().build();
    private VendedorDTO vendedor =  new VendedorBuilderDTO().build();
    private List<ProdutoDTO> produtos = Arrays.asList(new ProdutoBuilderDTO().build());
    private EnderecoDTO enderecoEntrega = new EnderecoBuilderDTO().build();

    public PedidoBuilderDTO() {
        super();
    }

    public PedidoBuilderDTO withId(int id) {
        this.id = id;
        return this;
    }

    public PedidoBuilderDTO withCliente(ClienteDTO cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilderDTO withVendedor(VendedorDTO vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public PedidoBuilderDTO withProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
        return this;
    }

    public PedidoBuilderDTO withEnderecoEntrega(EnderecoDTO enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        return this;
    }

    public PedidoDTO build() {
        return new PedidoDTO(id, cliente, vendedor, produtos, enderecoEntrega);
    }

}
