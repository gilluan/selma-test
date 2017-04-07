package com.selmatest.semaTest.converters;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TelefoneDTO;
import com.selmatest.semaTest.domain.TipoTelefone;

import fr.xebia.extras.selma.Selma;

public class TelefoneMapperTest {

    TelefoneMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(TelefoneMapper.class).build();
    }
    
    private TelefoneDTO getDTO() {
        return new TelefoneDTO("61983753630", TipoTelefone.CELULAR);
    }
    
    private Telefone getEntity() {
        return new Telefone("88884444", TipoTelefone.FIXO, "61");
    }

    @Test
    public void testToDTO() {
        Telefone entity = getEntity();
        TelefoneDTO dto = mapper.toDTO(entity);
        Assert.assertEquals(entity.getNumero(), dto.getNumero());
        Assert.assertEquals(entity.getTipo(), dto.getTipo());
        
    }
    
    @Test
    public void testToEntity() {
        TelefoneDTO dto = getDTO();
        Telefone entity = mapper.toEntity(dto);
        Assert.assertEquals(entity.getNumero(), dto.getNumero());
        Assert.assertEquals(entity.getTipo(), dto.getTipo());
    }
    
    @Test
    public void testListToEntity() {
        
        List<TelefoneDTO> lista = Arrays.asList(
                new TelefoneDTO("123456789", TipoTelefone.FIXO),
                new TelefoneDTO("987654321", TipoTelefone.CELULAR));
        
        List<Telefone> listEntity = mapper.toListEntity(lista);
        
        Assert.assertFalse(listEntity.isEmpty());
        Assert.assertEquals(listEntity.size(), lista.size());
        
    }
    


}
