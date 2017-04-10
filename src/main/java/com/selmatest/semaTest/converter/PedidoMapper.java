package com.selmatest.semaTest.converter;

import com.selmatest.semaTest.domain.Pedido;
import com.selmatest.semaTest.domain.PedidoDTO;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface PedidoMapper extends MapperBase<Pedido, PedidoDTO> {
}