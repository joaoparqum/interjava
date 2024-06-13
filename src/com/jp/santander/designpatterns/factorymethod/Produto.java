package com.jp.santander.designpatterns.factorymethod;

import java.math.BigDecimal;

public class Produto {

    private String descricao;
    private BigDecimal preco;
    private boolean dimensoes;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(boolean dimensoes) {
        this.dimensoes = dimensoes;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", dimensoes=" + dimensoes +
                '}';
    }
}
