package com.example.Exercicios.lesson10;

public class lesson10 {
    public static void main(String[] args) {
        Ave a = new Ave();
        a.locomover();
        a.setCorPena("Red");
        System.out.println(a.getCorPena());
        Cachorro c = new Cachorro();
        c.reagir(true);
    }
}
