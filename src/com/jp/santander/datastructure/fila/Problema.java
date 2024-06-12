package com.jp.santander.datastructure.fila;

import java.util.Random;

//atendimento de clientes por fila 1 por 1
public class Problema {

    public static void main(String[] args) {
        int n = 5;
        Random random = new Random();
        int cliente = random.nextInt(101);
        Fila fila = new Fila(cliente);
        System.out.println("Chegou o cliente: " + cliente);

        //adicionando os clientes
        for(int i=2; i<=n; i++){
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            fila.adicionar(cliente);
        }

        //atendendo os clientes um por um
        var noh = fila.remover();
        while(noh != null){
            System.out.println("Atendido o cliente: " + noh.getValor());
            noh = fila.remover();
        }
    }
}
