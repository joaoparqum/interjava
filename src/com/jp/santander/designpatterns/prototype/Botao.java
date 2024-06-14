package com.jp.santander.designpatterns.prototype;

public class Botao {

    protected String cor;
    protected int largura;
    protected int altura;
    protected TipoBotaoEnum tipoBorda;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public TipoBotaoEnum getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(TipoBotaoEnum tipoBorda) {
        this.tipoBorda = tipoBorda;
    }
}
