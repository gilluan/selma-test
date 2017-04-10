package com.selmatest.semaTest.converter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.builder.PedidoBuilder;
import com.selmatest.semaTest.builder.PedidoBuilderDTO;
import com.selmatest.semaTest.converter.PedidoMapper;
import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;
import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.EnderecoDTO;
import com.selmatest.semaTest.domain.Fornecedor;
import com.selmatest.semaTest.domain.FornecedorDTO;
import com.selmatest.semaTest.domain.GrupoEnum;
import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.PedidoDTO;
import com.selmatest.semaTest.domain.Produto;
import com.selmatest.semaTest.domain.ProdutoDTO;
import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TelefoneDTO;
import com.selmatest.semaTest.domain.TipoTelefoneEnum;
import com.selmatest.semaTest.domain.Vendedor;
import com.selmatest.semaTest.domain.VendedorDTO;

import fr.xebia.extras.selma.Selma;

public class PedidoTest {
    
    PedidoMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(PedidoMapper.class).build();
    }
    
    @Test
    public void testToDTO() {
        Pedido entity = new PedidoBuilder().build();
        PedidoDTO dto = mapper.toDTO(entity);
        
    }
    
    @Test
    public void testToEntity() {
        PedidoDTO dto = new PedidoBuilderDTO().build();
        Pedido entity = mapper.toEntity(dto);
    }
}
