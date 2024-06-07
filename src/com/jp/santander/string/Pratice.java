package com.jp.santander.string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Pratice {

    public static void main(String args[]){

        String nome = "João Paulo";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        LocalDateTime agora = LocalDateTime.now();
        String saudacao;

        if(agora.getHour() >= 6 && agora.getHour() <=12){
            saudacao = "Bom Dia";
        } else if (agora.getHour() >=13 && agora.getHour() <=18){
            saudacao = "Boa Tarde";
        } else if(agora.getHour() >= 19){
            saudacao = "Boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá %s, hoje é %s, %s\n", nome, diaSemana, saudacao);

    }

}
