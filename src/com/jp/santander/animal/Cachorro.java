package com.jp.santander.animal;

public class Cachorro {

    private String nome;
    private int altura;
    private double peso;
    private String estado;

    public Cachorro(){}

    public Cachorro(String nome, int altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void comer(){}

    public void latir(){
        System.out.println("au au");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        switch (acao){

            case "carinho":
                this.estado = "feliz";
                break;
            case "vai dormir":
                this.estado = "dormir";
                break;
            case "nada":
                this.estado = "neutro";
                break;

        }

        /*if(acao.equals("carinho")) {
            this.estado = "feliz";
        }else {
            this.estado = "neutro";
        }*/

        return estado;
    }


}
