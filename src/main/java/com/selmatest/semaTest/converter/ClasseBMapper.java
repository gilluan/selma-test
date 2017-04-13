package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.ClasseB;
import com.selmatest.semaTest.domain.ClasseBDTO;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(
		 withCustomFields = {
			        @Field({"nome", "apelido"})
			    }
)
public interface ClasseBMapper {
	
	ClasseBDTO asClasseBDTO(ClasseB in);

}
