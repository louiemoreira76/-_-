package com.example.Exercicios.lesson2;

public class lesson1 { //classe
    public static void main(String[] args){
    Caneta c1 = new Caneta(); 
   
    c1.Modelo = "Bic-Crystal";
    c1.Cor = "Preta";
    //c1.Ponta = 1.5F;
    //deixa mexer no protected pois esta dentro de uma classe que utiliza a classe Caneta
    c1.Carga = 90;
    //c1.Tampada = false; Nao pode privado
    c1.Estado();
    c1.Rabiscar();
    c1.Destampar();
    //Aqui não posso mexer no privado
    }
}
