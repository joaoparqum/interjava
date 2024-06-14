package com.jp.santander.designpatterns.prototype.solucao;

import com.jp.santander.designpatterns.prototype.Botao;

public class BotaoFactory {

    public static Botao getInstance(Botao prototipo) {

        Botao botao = new Botao();
        botao.setCor(prototipo.getCor());
        botao.setAltura(prototipo.getAltura());
        botao.setLargura(prototipo.getLargura());
        botao.setTipoBorda(prototipo.getTipoBorda());

        return botao;

    }
}
