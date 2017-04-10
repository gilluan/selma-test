package com.selmatest.semaTest.converter;

import java.util.List;

public interface MapperBase<E, D> {
    
    D toDTO(E entity);
    
    E toEntity(D dto);
    
    List<E> toListEntity(List<D> dto);
    
    List<D> toListDTO(List<E> entity);

}
