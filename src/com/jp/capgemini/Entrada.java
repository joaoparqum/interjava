package com.jp.capgemini;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {

        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade da pessoa:"));
        System.out.println("a idade dela é: " + idade);

    }

}
