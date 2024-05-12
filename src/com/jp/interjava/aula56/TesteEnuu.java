package com.jp.interjava.aula56;

public class TesteEnuu {

    public static void main(String[] args){

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumero(pf.getTipoDocumento().geraNumero());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumero(pj.getTipoDocumento().geraNumero());
        System.out.println(pj);


    }

}
