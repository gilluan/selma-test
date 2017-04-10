package com.selmatest.semaTest.converter;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.builder.TelefoneBuilder;
import com.selmatest.semaTest.builder.TelefoneBuilderDTO;
import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TelefoneDTO;
import com.selmatest.semaTest.domain.TipoTelefoneEnum;

import fr.xebia.extras.selma.Selma;

public class TelefoneMapperTest {

    TelefoneMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(TelefoneMapper.class).build();
    }


    @Test
    public void testToDTO() {
        Telefone entity = new TelefoneBuilder().build();
        TelefoneDTO dto = mapper.toDTO(entity);
        Assert.assertEquals(entity.getNumero(), dto.getNumero());
        Assert.assertEquals(entity.getTipo(), dto.getTipo());
        
    }
    
    @Test
    public void testToEntity() {
        TelefoneDTO dto = new TelefoneBuilderDTO().build();
        Telefone entity = mapper.toEntity(dto);
        Assert.assertEquals(entity.getNumero(), dto.getNumero());
        Assert.assertEquals(entity.getTipo(), dto.getTipo());
    }
    
    @Test
    public void testListToEntity() {
        
        List<TelefoneDTO> lista = Arrays.asList(
                new TelefoneDTO("123456789", TipoTelefoneEnum.FIXO),
                new TelefoneDTO("987654321", TipoTelefoneEnum.CELULAR));
        
        List<Telefone> listEntity = mapper.toListEntity(lista);
        
        Assert.assertFalse(listEntity.isEmpty());
        Assert.assertEquals(listEntity.size(), lista.size());
        
    }
    


}
