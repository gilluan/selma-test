package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.Fornecedor;
import com.selmatest.semaTest.domain.FornecedorDTO;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        
withCustomFields = {
        @Field({"endereco.logradouro", "logradouro"}),
        @Field({"endereco.bairro", "bairro"}),
        @Field({"endereco.cep", "cep"}),
        @Field({"endereco.numero", "numero"})
    }
)
public interface FornecedorMapper {

	FornecedorDTO toDTO(Fornecedor in);
	Fornecedor toEntity(FornecedorDTO in);
	
}
