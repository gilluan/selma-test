package com.selmatest.semaTest.converter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

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
    
    private PedidoDTO getDTO() {
        List<TelefoneDTO> telefones = Arrays.asList(new TelefoneDTO("123456789", TipoTelefoneEnum.CELULAR));
        ClienteDTO cliente = new ClienteDTO("gilluan", 29, null, telefones, null);
        VendedorDTO vendedor = new VendedorDTO("nome Vendedor", 12, null, null, "123", new Date());
        FornecedorDTO fornecedor = new FornecedorDTO(1001, "Suvinil Tintas LTDA", null, new EnderecoDTO());
        ProdutoDTO tinta = new ProdutoDTO(10, "Tinta Suvinil", BigDecimal.valueOf(157.0), fornecedor, GrupoEnum.ATACADO);
        List<ProdutoDTO> produtos = Arrays.asList(tinta);
        EnderecoDTO enderecoEntrega = new EnderecoDTO();
        return new PedidoDTO(1, cliente, vendedor, produtos, enderecoEntrega);
    }
    
    private Pedido getEntity() {
        List<Telefone> telefones = Arrays.asList(new Telefone("123456789", TipoTelefoneEnum.CELULAR, "65"));
        Cliente cliente = new Cliente("gilluan", 29, null, telefones, null, null);
        Vendedor vendedor = new Vendedor("nome Vendedor", 12, null, null, null, "mat123",  new Date());
        Fornecedor fornecedor = new Fornecedor(1001, "Suvinil Tintas LTDA", null, new Endereco());
        Produto tinta = new Produto(10, "Tinta Suvinil", BigDecimal.valueOf(157.0), fornecedor, GrupoEnum.ATACADO);
        List<Produto> produtos = Arrays.asList(tinta);
        Endereco enderecoEntrega = new Endereco();
        return new Pedido(1, cliente, vendedor, produtos, enderecoEntrega);
    }

    @Test
    public void testToDTO() {
        Pedido entity = getEntity();
        PedidoDTO dto = mapper.toDTO(entity);
        
    }
    
    @Test
    public void testToEntity() {
        PedidoDTO dto = getDTO();
        Pedido entity = mapper.toEntity(dto);
    }
}
