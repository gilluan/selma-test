package com.selmatest.semaTest.converter;


import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;

import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreFields = {"endereco", "ddd"})
public interface ClienteMapper {

	
	Cliente toEntity(ClienteDTO in);
	ClienteDTO toDTO(Cliente in);
    Cliente clone(Cliente pessoa);

}
