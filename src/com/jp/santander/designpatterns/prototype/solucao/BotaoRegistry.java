package com.jp.santander.designpatterns.prototype.solucao;

import com.jp.santander.designpatterns.prototype.Botao;
import com.jp.santander.designpatterns.prototype.TipoBotaoEnum;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(12);
        botaoAmarelo.setLargura(123);
        botaoAmarelo.setTipoBorda(TipoBotaoEnum.GROSSA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(12);
        botaoAzul.setLargura(123);
        botaoAzul.setTipoBorda(TipoBotaoEnum.GROSSA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegistry getInstance() {
        if(botaoRegistry == null){
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }
        return botaoRegistry;
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

}
