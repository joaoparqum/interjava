package com.jp.interjava.aula54;

public class Formulario {

    //caso eu não queria usar o enum em varias classes
    enum Genero{
        FEMININO('F'), MASCULINO('M');

        char sexo;

        Genero(char sexo){
            this.sexo = sexo;
        }
    }

    private String nome;
    private Genero genero;


}
