package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TelefoneDTO;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface TelefoneMapper extends MapperBase<Telefone, TelefoneDTO> {
}
