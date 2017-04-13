package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.Carro;
import com.selmatest.semaTest.domain.CarroDTO;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;


@Mapper(
        withCustomFields = {
        		@Field({"modelo", "nomeComercial"})
        },
        withIgnoreFields = "ano"
)

public abstract class CarroMapper implements MapperBase<Carro, CarroDTO> {
        
	public abstract CarroDTO toDTO(Carro entity);
    
    public Carro toEntity(CarroDTO dto) {
    	return new Carro(dto.getMarca(), dto.getModelo());
    };
}
