package com.jp.interjava.aula67;

public class MinhaThread extends Thread{

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {
        try{
            for(int i=0; i<10; i++) {
                System.out.println(nome + " contador " + i);
                sleep(tempo);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
