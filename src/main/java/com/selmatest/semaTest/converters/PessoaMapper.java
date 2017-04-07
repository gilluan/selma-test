package com.selmatest.semaTest.converters;

import com.selmatest.semaTest.domain.Pessoa;
import com.selmatest.semaTest.domain.PessoaDTO;

import fr.xebia.extras.selma.Mapper;

@Mapper
public interface PessoaMapper extends MapperBase<Pessoa, PessoaDTO> {

    Pessoa clone(Pessoa pessoa);

}
