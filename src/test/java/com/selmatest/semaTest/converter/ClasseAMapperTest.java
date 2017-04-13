package com.selmatest.semaTest.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.selmatest.semaTest.domain.ClasseA;
import com.selmatest.semaTest.domain.ClasseADTO;
import com.selmatest.semaTest.domain.ClasseB;

import fr.xebia.extras.selma.Selma;

public class ClasseAMapperTest {
	
	ClasseAMapper mapper;
	ClasseBMapper bMapper;
	
    @Before
    public void init() {
    	bMapper = Selma.builder(ClasseBMapper.class).build();
		mapper = Selma.builder(ClasseAMapper.class).withCustom(bMapper).build();
    }

	@Test
	public void test() {
		ClasseB b = ClasseB.builder()
		.nome("nome B")
		.build();
		
		ClasseA a = ClasseA.builder()
		.nome("noem")
		.b(b)
		.build();
		
		
		ClasseADTO dto = mapper.toDTO(a);
		
		Assert.assertNotNull(dto);
		Assert.assertEquals(a.getNome(), dto.getNome());
		Assert.assertNotNull(dto.getB());
		Assert.assertEquals(b.getNome(), dto.getB().getApelido());
		
	}

}
