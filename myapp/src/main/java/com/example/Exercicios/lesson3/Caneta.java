package com.example.Exercicios.lesson3;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p){ //Metodo construtor (sempre tem o nome da msm classe)
        this.modelo = m; //atributo direto
        this.cor = c;
        this.setPonta(p); //atraves do metodo
        this.tampar();
    }

    public String getModelo(){ //como essa função retorna algo void não
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;      
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Modelo: " + this.getModelo()); //.modelo ou .ponta da mas é o atributo direto e não é tão seguro!
        System.out.println("Ponta: " + this.getPonta());//get protreje o acesso direto ao atributo
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }
}
