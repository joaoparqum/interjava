package com.jp.interjava.aula71;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array) {

        soma = 0;

        for(int i=0; i<array.length; i++){
            soma += array[i];

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return soma;
    }

}
