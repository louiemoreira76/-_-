package com.example.Exercicios.lesson1;
public class Caneta {
    //Atributos 
    String Modelo;
    String Cor;
    float Ponta; 
    byte Carga;
    boolean Tampada;
    //Metodos
    void Estado(){
        System.out.println("Caneta " + this.Cor);//this é uma alto referencia 
        System.out.println("Esta tampada? " + this.Tampada);
        System.out.println("Ponta " + this.Ponta);
        System.out.println("Carga " + this.Carga);
        System.out.println("Modelo " + this.Modelo);
    }
    
    void Rabiscar(){ //void significa sem retorno!
        if(this.Tampada == true){
            System.err.println("ERRO esta tampada");
        }
        else{
            System.out.println("Rabiscos");
        }
    }
    void Tampar(){
        this.Tampada = true; //this é proprio objeto q chamo no caso c1
    }
    void Destampar(){
        this.Tampada = false;
    }
}   

