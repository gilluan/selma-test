package com.selmatest.semaTest.domain;

public enum GrupoEnum {
    
    ATACADO("A", "Atacado"), VAREJO("V", "Varejo");
    
    private String sigla;
    private String descricao;
    
    private GrupoEnum(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
