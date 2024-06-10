package com.jp.santander.animal;

public class Animal {

    public static void main(String[] args) {

        Cachorro ca = new Cachorro();

        ca.setNome("Bengo");
        ca.setAltura(80);
        ca.setPeso(70);

        Cachorro ca2 = new Cachorro();

        ca2.setNome("Logan");
        ca2.setAltura(80);
        ca2.setPeso(70);

        //usando variavel estatica
        System.out.println(ca.getNumeroDeCachorros());
        System.out.println(ca2.getNumeroDeCachorros());

        ca.latir();
        ca.pegar();

        System.out.println("O cachorro está " + ca.interagir("carinho"));

        System.out.println(ca.toString());

    }

}
