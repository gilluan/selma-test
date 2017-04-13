package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.PedidoDTO;

import fr.xebia.extras.selma.Mapper;

@Mapper( withIgnoreFields = {"endereco", "matricula", "nascimento"},
		withCustom = {FornecedorMapper.class, ClienteMapper.class, TelefoneMapper.class})
public interface PedidoMapper extends MapperBase<Pedido, PedidoDTO> {

}
