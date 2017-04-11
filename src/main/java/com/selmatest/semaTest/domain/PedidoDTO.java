package com.selmatest.semaTest.domain;

import java.util.List;


import lombok.Builder;


@Builder
public class PedidoDTO {

    private int id;
    private ClienteDTO cliente;
    private VendedorDTO vendedor;
    private List<ProdutoDTO> produtos;
    private EnderecoDTO enderecoEntrega;

    public PedidoDTO() {
        super();
    }

    public PedidoDTO(int id, ClienteDTO cliente, VendedorDTO vendedor, List<ProdutoDTO> produtos,
            EnderecoDTO enderecoEntrega) {
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

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public VendedorDTO getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorDTO vendedor) {
        this.vendedor = vendedor;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }

    public EnderecoDTO getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(EnderecoDTO enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

}
