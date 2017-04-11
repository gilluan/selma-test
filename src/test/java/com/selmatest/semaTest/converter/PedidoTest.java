package com.selmatest.semaTest.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;
import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.PedidoDTO;

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
        
    }
    
    private Pedido getEntity() {
        Cliente cliente = Cliente
                            .builder()
                            .nome("cliente teste")
                            .build();
        return Pedido
                .builder()
                .id(12)
                .cliente(cliente)
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
