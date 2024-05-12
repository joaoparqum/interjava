package com.jp.interjava.aula55;

import com.jp.interjava.aula54.DiaSemana;

public class TesteEnum {

    public static void main(String [] args){

        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia: DiaSemana.values()) {
            System.out.println(dia);
        }

        DiaSemana dia;
        System.out.println("POR VALUE OF");
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

    }

}
