package com.selmatest.semaTest.converters;

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
public interface CarroMapper extends MapperBase<Carro, CarroDTO> {
        
}
