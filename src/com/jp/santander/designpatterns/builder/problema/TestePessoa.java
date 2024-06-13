package com.jp.santander.designpatterns.builder.problema;

import com.jp.santander.designpatterns.builder.Pessoa;
import com.jp.santander.designpatterns.builder.solucao.PessoaBuilder;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Paulo",
                "Arquim",
                "2343523542",
                "arquimjoao@gmail.com",
                "CJ",
                LocalDate.of(2000,1,24));

        System.out.print(pessoa);

        Pessoa pessoab = new Pessoa.PessoaBuilder().
                nome("João").
                sobrenome("Arquim").
                apelido("CJ").
                criaPessoa();

        System.out.print(pessoab);

    }

}
