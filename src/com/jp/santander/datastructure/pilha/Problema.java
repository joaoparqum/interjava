package com.jp.santander.datastructure.pilha;

public class Problema {

    //inverter conteudos de uma pilha
    public static void main(String[] args) {

        int[] numeros = {5,4,3,2,1};

        inverter(numeros);

    }

    private static void inverter(int[] numeros) {

        Pilha pilha = new Pilha(numeros[0]);

        for(int i=0; i< numeros.length; i++) {
            pilha.adicionar(numeros[i]);
        }

        var noh = pilha.remover();
        while(noh != null) {
            System.out.println(noh.getValor());
            noh = pilha.remover();
        }


    }
}
