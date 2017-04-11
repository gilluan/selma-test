package com.selmatest.semaTest.converter;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;
import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Fornecedor;
import com.selmatest.semaTest.domain.FornecedorDTO;
import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.PedidoDTO;
import com.selmatest.semaTest.domain.Produto;
import com.selmatest.semaTest.domain.ProdutoDTO;

import fr.xebia.extras.selma.Selma;

public class PedidoTest {
    
    PedidoMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(PedidoMapper.class).build();
    }
    
        
    @Test
    public void testToDTO() {
        Pedido entity = getEntity();
        PedidoDTO dto = mapper.toDTO(entity);
        Assert.assertNotNull(dto);
        Assert.assertEquals(entity.getId(), dto.getId());
        Assert.assertNotNull(dto.getCliente());
        Assert.assertEquals(entity.getCliente().getNome(), dto.getCliente().getNome());
        
        List<ProdutoDTO> produtos = dto.getProdutos();
        Assert.assertNotNull(produtos);
        Assert.assertNotEquals(0, produtos.size());
        
        ProdutoDTO produtoDTO = produtos.get(0);
        Assert.assertNotNull(produtoDTO);
        
        FornecedorDTO fornecedor = produtoDTO.getFornecedor();
        Assert.assertNotNull(fornecedor);

    }
    
    private Pedido getEntity() {
        Cliente cliente = Cliente
                            .builder()
                            .nome("cliente teste")
                            .build();
        
        Endereco endereco = Endereco
                                .builder()
                                .logradouro("rua 1")
                                .build();
        
        Fornecedor fornecedor = Fornecedor
                                    .builder()
                                    .nome("fornecedor Teste")
                                    .endereco(endereco)
                                    .build();
        Produto produtoA = Produto
                            .builder()
                            .descricao("produto!")
                            .fornecedor(fornecedor)
                            .build();
        
        
        List<Produto> produtos = Arrays.asList(produtoA);
        return Pedido
                .builder()
                .id(12)
                .cliente(cliente)
                .produtos(produtos)
                .build();
    }


    @Test
    public void testToEntity() {

        PedidoDTO dto = getDTO();
        Pedido entity = mapper.toEntity(dto);
        Assert.assertNotNull(entity);
        Assert.assertEquals(dto.getId(), entity.getId());
        Assert.assertNotNull(entity.getCliente());
        Assert.assertEquals(dto.getCliente().getNome(), entity.getCliente().getNome());
        
    }
    
    private PedidoDTO getDTO() {

        ClienteDTO cliente = ClienteDTO
                .builder()
                .nome("cliente teste")
                .build();
        return PedidoDTO
            .builder()
            .id(12)
            .cliente(cliente)
            .build();
    }
}
