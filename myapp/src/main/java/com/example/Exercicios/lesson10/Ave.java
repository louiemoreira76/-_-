package com.example.Exercicios.lesson10;

public class Ave extends Animal{
    private String corPena;

    public void fzrNinho(){
        System.out.println("Fazendo ninho!");
    }

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String c) {
        this.corPena = c;
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo com o bico nhunhym");
    };
    @Override
    public void emitirSom(){
        System.out.println("Cantando!!");
    };
}
