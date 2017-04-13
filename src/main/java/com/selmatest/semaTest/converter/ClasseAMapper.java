package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.ClasseA;
import com.selmatest.semaTest.domain.ClasseADTO;

import fr.xebia.extras.selma.Mapper;

@Mapper(withCustom = ClasseBMapper.class)
public interface ClasseAMapper {
	
	ClasseADTO toDTO(ClasseA a);
	

}
