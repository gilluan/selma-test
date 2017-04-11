package com.selmatest.semaTest.converter;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;

import fr.xebia.extras.selma.Selma;

public class ClienteTest {
    
    ClienteMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(ClienteMapper.class).build();
    }
    
    public Cliente getEntity() {
        return  Cliente
                .builder()
                .nome("teste 1")
                .idade(12)
                .apelidos(Arrays.asList("apelido 1", "Apelido 2"))
                .build();
    }
    
    private ClienteDTO getDTO() {
        return ClienteDTO
                .builder()
                .nome("teste 1")
                .idade(12)
                .apelidos(Arrays.asList("apelido 1", "Apelido 2"))
                .build();
    }

    @Test
    public void testToDTO() {
        Cliente jose = getEntity();
        ClienteDTO joseDTO = mapper.toDTO(jose);
        Assert.assertEquals(jose.getNome(), joseDTO.getNome());
        Assert.assertEquals(jose.getIdade(), joseDTO.getIdade());
        Assert.assertEquals(2, joseDTO.getApelidos().size());
        Assert.assertEquals(jose.getApelidos().get(0), joseDTO.getApelidos().get(0));
    }
    
    @Test
    public void testToEntity() {
        
        ClienteDTO dto = getDTO();
        Cliente entity = mapper.toEntity(dto);
        Assert.assertEquals(entity.getNome(), dto.getNome());
        Assert.assertEquals(entity.getIdade(), dto.getIdade());
        Assert.assertEquals(2, dto.getApelidos().size());
        Assert.assertEquals(dto.getApelidos().get(0), entity.getApelidos().get(0));
        
    }
}
