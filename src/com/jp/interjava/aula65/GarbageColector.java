package com.jp.interjava.aula65;

import com.jp.interjava.aula56.Pessoa;

public class GarbageColector {

    public static void obterMemoria(){

        final int MB = 1024 * 1024;

        //pega memoria em tempo real
        Runtime runtime = Runtime.getRuntime();

        //ele vai retornar a memoria em bytes por isso faz a conversão para megabytes
        //memoria total - memoria livre / MB
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[10000];
        Pessoa pessoa;

        for(int i=0; i<pessoas.length; i++){
            pessoa = new Pessoa();
            pessoas[i] = pessoa;
        }

        System.out.println("pessoas criadas");

        obterMemoria();

        pessoas = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("pessoas excluidas");

        obterMemoria();

    }

}
