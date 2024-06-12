package com.jp.santander.datastructure.pilha;

public class Pilha {

    private Noh topo;
    private int altura;

    public class Noh{

        int valor;
        Noh proximo;

        Noh(int valor){
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    public Pilha(int valor){
        Noh novoNoh = new Noh(valor);
        topo = novoNoh;
        altura = 1;
    }

    public void lerTopo(){
        if(topo == null){
            System.out.println("Pilha vazia!");
        }else {
            System.out.println("Topo: " + topo.valor);
        }
    }

    public void pegarAltura(){
        System.out.println("Altura: " + altura);
    }

    public void imprimir(){
        System.out.println("###################");
        Noh temp = topo;//nó aponta para o topo
        while(temp != null){//enquando houver dados
            System.out.println(temp.valor);//imprime
            temp = temp.proximo;//percorre a pilha
        }
        System.out.println("###################");
    }

    public void adicionar(int valor){
        Noh novoNoh = new Noh(valor);
        if(altura == 0){
            topo = novoNoh;
        }else {
            novoNoh.proximo = topo;
            topo = novoNoh;
        }
        altura++;
    }

    public Noh remover() {
        if(altura == 0) return null;

        Noh temp = topo;// nó temporario recebe o topo
        topo = topo.proximo;//o topo aponta para o proximo
        topo.proximo = null;//o proximo é removido
        altura--;//diminui a altura

        return temp;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(4);

        pilha.lerTopo();
        pilha.pegarAltura();
        pilha.imprimir();

        pilha.adicionar(1);
        pilha.imprimir();
        pilha.lerTopo();
        pilha.pegarAltura();
    }

}
