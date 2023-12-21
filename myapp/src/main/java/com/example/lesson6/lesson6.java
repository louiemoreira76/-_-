package com.example.lesson6;

public class lesson6 {
    public static void main(String[] args) {
        Lutador[] L = new Lutador[6]; // Ajuste o tamanho do array para 6
        L[0] = new Lutador("Pretty Boy", "França", (byte) 31, 1.75f, 68.9f, (byte) 11, (byte) 2, (byte) 1);
        L[1] = new Lutador("Putscript", "Brasil", (byte) 29, 1.68f, 80.1f, (byte) 14, (byte) 2, (byte) 3);
        L[2] = new Lutador("Snapshadow", "EUA", (byte) 35, 1.65f, 70.2f, (byte) 12, (byte) 2, (byte) 1);
        L[3] = new Lutador("Dead Code", "Austrália", (byte) 28, 1.93f, 81.6f, (byte) 13, (byte) 0, (byte) 2);
        L[4] = new Lutador("Ufocobol", "Brasil", (byte) 37, 1.70f, 119.3f, (byte) 5, (byte) 4, (byte) 3);
        L[5] = new Lutador("Nerdaard", "EUA", (byte) 30, 1.81f, 105.7f, (byte) 12, (byte) 2, (byte) 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[1], L[3]);
        UEC01.lutar();
        L[1].status();
        L[3].status();
    }    
}
