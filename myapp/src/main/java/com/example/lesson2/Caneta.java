package com.example.lesson2;
public class Caneta {
    //Atributos 
    public String Modelo;
    public String Cor;
    private float Ponta; 
    protected byte Carga;
    private boolean Tampada;
    //Metodos
    public void Estado(){
        System.out.println("Caneta " + this.Cor);
        System.out.println("Esta tampada? " + this.Tampada);
        System.out.println("Ponta " + this.Ponta);
        System.out.println("Carga " + this.Carga);
        System.out.println("Modelo " + this.Modelo);
    }
    
    public void Rabiscar(){ 
        if(this.Tampada == true){
            System.err.println("ERRO esta tampada");
        }
        else{
            System.out.println("Rabiscos");
        }
    }
    public void Tampar(){
        this.Tampada = true; 
        //Aqui posso mexer no privado
    }
    public void Destampar(){
        this.Tampada = false;
        //Aqui posso mexer no privado
    }
}   

