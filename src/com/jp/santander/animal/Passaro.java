package com.jp.santander.animal;

public class Passaro extends Animal{

    static int numeroPassaros;

    public Passaro(String nome, int altura, double peso) {
        super(nome, altura, peso);
    }

    @Override
    public void soar() {
        System.out.println("PIU!");
    }
}
