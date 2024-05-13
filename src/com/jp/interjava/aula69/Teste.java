package com.jp.interjava.aula69;

public class Teste {

    public static void main(String [] args) {

        MinhaThreadRunnable t1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable t2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable t3 = new MinhaThreadRunnable("#3", 500);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();

        //usei o join para parar a thread depois uma da outra
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("programa finalizado!");

    }

}
