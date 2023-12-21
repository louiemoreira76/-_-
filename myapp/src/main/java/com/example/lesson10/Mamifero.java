package com.example.lesson10;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo(){
        return corPelo;
    }
    public void setCorPelo(String p){
        this.corPelo = p;
    }

    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo com a boca uymyuyum");
    };
    @Override
    public void emitirSom(){
        System.out.println("Hablando!");
    };
}
