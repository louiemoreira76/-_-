package com.example;

import java.util.Scanner;

public class Opp {

    String nome1; //declaração de atributo, que posso referenciar em todos os metodos
    static String nome2 = "oi";

    public static void main(String[] args){
        //System.out.println(nome2);

    Scanner scanner = new Scanner(System.in);
    String nome;
    nome = scanner.next();
    System.out.println("Seja bem-vindo " + nome);
    }
}
