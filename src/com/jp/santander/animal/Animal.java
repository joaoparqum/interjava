package com.jp.santander.animal;

public abstract class Animal {

    protected String nome;
    protected int altura;
    protected double peso;
    protected String estado;
    public Animal(String nome, int altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public void comer(){}

    public abstract void soar();
}
