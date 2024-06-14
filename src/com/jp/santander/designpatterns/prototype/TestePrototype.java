package com.jp.santander.designpatterns.prototype;

import com.jp.santander.designpatterns.prototype.solucao.BotaoRegistry;

public class TestePrototype {

    public static void main(String[] args) {

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);
    }

}
