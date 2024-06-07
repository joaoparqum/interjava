package com.jp.santander.animal;

public class Animal {

    public static void main(String[] args) {

        Cachorro ca = new Cachorro();

        ca.setNome("Bengo");
        ca.setAltura(80);
        ca.setPeso(70);

        ca.latir();
        ca.pegar();

        System.out.println("O cachorro está " + ca.interagir("carinho"));

    }

}
