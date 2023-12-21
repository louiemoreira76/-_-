package com.example.lesson10;

public final class Cachorro extends Mamifero{
    
    @Override
    public void emitirSom(){
        System.out.println("AUAUAUAU!");
    };
    //sobre carga e Assinaturas
    public void reagir(String frase){
        if(frase.equals("Toma Comida")|| frase == "OLÁ"){ //tanto faz os dois 
            System.out.println("Abanar e Latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(byte hora, byte min){
        if (hora < 12) {
            System.out.println("Abanar");
        }
        else if (hora >= 18) {
            System.out.println("Ignorar");
        }
        else{
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        }
        else{
            System.out.println("Rosnar e Latir");
        }
    }
    public void reagir(byte idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }
            else{
                System.out.println("Latir");
            }
        }
        else{
            if(peso < 10) {
                System.out.println("Rosgar");
            }
            else{
                System.out.println("Ignorar");
            }
        }
    }

}
