package com.example.Exercicios.lesson10;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String c){
        this.corEscama = c;
    }

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo com o bicão rnhrurnrhyrm");
    };
    @Override
    public void emitirSom(){
        System.out.println("...rerrrreerrr");
    };
}
