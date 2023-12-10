package com.example.lesson1;

public class lesson1 { //classe
    public static void main(String[] args){ //metodo main
    Caneta c1 = new Caneta(); //Instanciando 
    //classe na frete 
    Exercicio ex1 = new Exercicio();
     
    //Chamada a atributo
    c1.Cor = "Azul";
    c1.Ponta = 0.10f;
    //Chamada a um metodo
    c1.Destampar();
    c1.Rabiscar();
    c1.Estado();
    

    ex1.Day = "Biceps e Dorsal";
    ex1.Pesos = true;
    ex1.Descanso = 30.05F;
    ex1.Aquecido = true;

    ex1.Metodos();
    ex1.Carga();
    }
}
