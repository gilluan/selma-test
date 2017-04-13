package com.selmatest.semaTest.converter;

import java.util.List;

import com.selmatest.semaTest.domain.Telefone;
import com.selmatest.semaTest.domain.TelefoneDTO;

import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreFields = "ddd")
public interface TelefoneMapper {

	Telefone toEntity(TelefoneDTO in);
	TelefoneDTO toDTO(Telefone in);
	
	List<Telefone> toListEntity(List<TelefoneDTO> in);
	List<TelefoneDTO> toListDTO(List<Telefone> in);
}
