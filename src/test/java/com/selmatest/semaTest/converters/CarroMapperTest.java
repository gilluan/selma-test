package com.selmatest.semaTest.converters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.converters.CarroMapper;
import com.selmatest.semaTest.domain.Carro;
import com.selmatest.semaTest.domain.CarroDTO;

import fr.xebia.extras.selma.Selma;

public class CarroMapperTest {
    
    CarroMapper mapper;
    
    @Before
    public void init() {
         mapper = Selma.builder(CarroMapper.class).build();
    }
    
    private CarroDTO getDTO() {
        return new CarroDTO("fiat", "uno");
    }
    
    private Carro getEntity() {
        return new Carro("wv", 2016, "saveiro");
    }

    @Test
    public void testToDTO() {
        Carro entity = getEntity();
        CarroDTO dto = mapper.toDTO(entity);
        Assert.assertEquals(entity.getNomeComercial(), dto.getModelo());
        Assert.assertEquals(entity.getMarca(), dto.getMarca());
        
    }
    
    @Test
    public void testToEntity() {
        CarroDTO dto = getDTO();
        Carro entity = mapper.toEntity(dto);
        Assert.assertEquals(entity.getNomeComercial(), dto.getModelo());
        Assert.assertEquals(entity.getMarca(), dto.getMarca());
    }
    
    
}

