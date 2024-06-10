package com.jp.santander.animal;

public class Gato extends Animal{

    static int numeroGatos;

    public Gato(String nome, int altura, double peso) {
        super(nome, altura, peso);
    }

    @Override
    public void soar() {
        System.out.println("MIAU!");
    }
}
