package com.jp.santander.animal;

public class Floresta {

    public static void main(String[] args) {

        Cachorro ca = new Cachorro("Bengo",80,70);
        Gato ga = new Gato("Guts", 12, 5.7);
        Passaro pa = new Passaro("Falcon", 34, 12);

        ca.soar();
        ga.soar();
        pa.soar();

        System.out.println("O cachorro está " + ca.interagir("carinho"));

        System.out.println(ca.toString());

    }

}
