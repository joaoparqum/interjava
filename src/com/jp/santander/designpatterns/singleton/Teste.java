package com.jp.santander.designpatterns.singleton;

import com.jp.santander.designpatterns.singleton.solucao.AgendaSingletonEAGER;
import com.jp.santander.designpatterns.singleton.solucao.AgendaSingletonLAZY;

public class Teste {

    public static void main(String[] args) {

        //reservaDiaEager("Sexta");
        //reservaDiaEager("Sabado");

        reservaDiaLazy("Sexta");
        reservaDiaLazy("Sabado");

    }

    public static void reservaDiaEager(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }

    public static void reservaDiaLazy(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
