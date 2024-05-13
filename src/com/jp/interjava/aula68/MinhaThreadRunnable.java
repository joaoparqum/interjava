package com.jp.interjava.aula68;

public class MinhaThreadRunnable implements Runnable{

    private String nome;
    private int tempo;

    MinhaThreadRunnable(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        //instanciei o objeto da classe Thread para chamar o método start
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i=0; i<10; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
