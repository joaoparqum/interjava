package com.jp.interjava.aula71;

public class ThreadSoma implements Runnable{

    private String nome;
    private int[] num;
    private static Calculadora calc = new Calculadora();

    public ThreadSoma(String nome, int[] num){
        this.nome = nome;
        this.num = num;
        Thread t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {

        int soma = calc.somaArray(this.num);
        System.out.println("Resultado da soma: " + this.nome + " eh: " + soma);

    }
}
