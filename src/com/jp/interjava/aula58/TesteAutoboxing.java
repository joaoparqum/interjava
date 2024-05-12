package com.jp.interjava.aula58;

public class TesteAutoboxing {

    public static void main(String[] args) {

        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l; //new Long(10000l);
        Float num11 = 3.5f; //new Float(3.5f);
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character b = 'b';

        //auto unboxing
        int num13 = num9; // transformando numero wrapper em primitivo

        num9++; //101




    }

}
