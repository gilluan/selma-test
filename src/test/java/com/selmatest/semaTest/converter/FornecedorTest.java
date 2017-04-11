package com.selmatest.semaTest.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.EnderecoDTO;
import com.selmatest.semaTest.domain.Fornecedor;
import com.selmatest.semaTest.domain.FornecedorDTO;

import fr.xebia.extras.selma.Selma;

public class FornecedorTest {
    
    private FornecedorMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(FornecedorMapper.class).build();
    }
    
    @Test
    public void testToEntity() {
        FornecedorDTO dto = getDTO();
        Fornecedor entity = mapper.toEntity(dto);
        
        Assert.assertNotNull(entity);
        Endereco endereco = entity.getEndereco();
        Assert.assertNotNull(endereco);
        Assert.assertEquals(dto.getLogradouro(), endereco.getLogradouro());
        
        
    }
    
    private FornecedorDTO getDTO() {
        return FornecedorDTO
                .builder()
                .nome("fornecedor Teste")
                .logradouro("rasdfasfas")
                .build();
    }

    @Test
    public void testToDTO() {
        Fornecedor fornecedor = getEntity();
        FornecedorDTO dto = mapper.toDTO(fornecedor);
        Assert.assertNotNull(dto);
        Assert.assertEquals(dto.getLogradouro(), fornecedor.getEndereco().getLogradouro());
    }

    private Fornecedor getEntity() {
        Endereco endereco = Endereco
                .builder()
                .logradouro("rua 1")
                .build();
        return Fornecedor
                .builder()
                .nome("fornecedor Teste")
                .endereco(endereco)
                .build();
    }

}
