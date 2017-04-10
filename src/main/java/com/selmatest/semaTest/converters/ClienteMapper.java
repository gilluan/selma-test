package com.selmatest.semaTest.converters;


import com.selmatest.semaTest.domain.Cliente;
import com.selmatest.semaTest.domain.ClienteDTO;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface ClienteMapper extends MapperBase<Cliente, ClienteDTO> {

    Cliente clone(Cliente pessoa);

}
