package com.selmatest.semaTest.converters;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.converters.PessoaMapper;
import com.selmatest.semaTest.domain.Pessoa;
import com.selmatest.semaTest.domain.PessoaDTO;

import fr.xebia.extras.selma.Selma;




public class PessoaTest {
    
    PessoaMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(PessoaMapper.class).build();
    }
    
    private PessoaDTO getDTO() {
        return new PessoaDTO("jose", 45, Arrays.asList("ze", "xpto"));
    }
    
    private Pessoa getEntity() {
        return new Pessoa("jose", 45, Arrays.asList("ze", "xpto"));
    }

    @Test
    public void testToDTO() {
        Pessoa jose = getEntity();
        PessoaDTO joseDTO = mapper.toDTO(jose);
        Assert.assertEquals(jose.getNome(), joseDTO.getNome());
        Assert.assertEquals(jose.getIdade(), joseDTO.getIdade());
        Assert.assertEquals(2, joseDTO.getApelidos().size());
        Assert.assertEquals("ze", joseDTO.getApelidos().get(0));
    }
    
    @Test
    public void testToEntity() {
        
        PessoaDTO dto = getDTO();
        Pessoa entity = mapper.toEntity(dto);
        
        Assert.assertEquals(entity.getNome(), dto.getNome());
        Assert.assertEquals(entity.getIdade(), dto.getIdade());
        Assert.assertEquals(2, dto.getApelidos().size());
        Assert.assertEquals("ze", dto.getApelidos().get(0));
        
    }
}
