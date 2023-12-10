package com.example;

public class Opp {

    String nome1; //declaração de atributo, que posso referenciar em todos os metodos

    static String nome2;
    public static void main(String[] args){
        System.out.println(nome2);
    }

    static void teste(){};

    Opp meuOpp = new Opp(); //objeto Instancia da classe


    void declararnome(){ //não retorna nada "return"
        Opp.teste(); //não presisa criar uma instancia, um objeto dessa classe
        nome1 = "Luis";
        //Opp.declararnome(); não pode pois não é um método estatico, pertece só a instancia 
        meuOpp.declararnome();
    }
}
