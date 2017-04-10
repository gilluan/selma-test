package com.selmatest.semaTest.converters;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;
import com.selmatest.semaTest.domain.Endereco;
import com.selmatest.semaTest.domain.Pessoa;
import com.selmatest.semaTest.domain.PessoaDTO;
import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TelefoneDTO;
import com.selmatest.semaTest.domain.TipoTelefoneEnum;

import fr.xebia.extras.selma.Selma;




public class ClienteTest {
    
    ClienteMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(ClienteMapper.class).build();
    }
    
    private ClienteDTO getDTO() {
        return new 
                ClienteDTO("jose", 45, 
                            Arrays.asList("ze", "xpto"), 
                            Arrays.asList(new TelefoneDTO("123457898", TipoTelefoneEnum.CELULAR)), 
                            "alguam observacao relevante");
    }
    
    private Cliente getEntity() {
        return new Cliente("jose", 45, 
                            Arrays.asList("ze", "xpto"), 
                            Arrays.asList(new Telefone("123457898", TipoTelefoneEnum.CELULAR, "98")),
                            new Endereco("rua a", "centro", "72210048", "123", "proximo a casa ao lado"), 
                            "uma observacao");
    }

    @Test
    public void testToDTO() {
        Cliente jose = getEntity();
        ClienteDTO joseDTO = mapper.toDTO(jose);
        Assert.assertEquals(jose.getNome(), joseDTO.getNome());
        Assert.assertEquals(jose.getIdade(), joseDTO.getIdade());
        Assert.assertEquals(2, joseDTO.getApelidos().size());
        Assert.assertEquals("ze", joseDTO.getApelidos().get(0));
    }
    
    @Test
    public void testToEntity() {
        
        ClienteDTO dto = getDTO();
        Cliente entity = mapper.toEntity(dto);
        Assert.assertEquals(entity.getNome(), dto.getNome());
        Assert.assertEquals(entity.getIdade(), dto.getIdade());
        Assert.assertEquals(2, dto.getApelidos().size());
        Assert.assertEquals("ze", dto.getApelidos().get(0));
        
    }
}
