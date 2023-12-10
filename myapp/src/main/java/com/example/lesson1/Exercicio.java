package com.example.lesson1;
    
public class Exercicio {
    byte series = 3 * 10;
    String Day;
    boolean Pesos;
    byte KG = 5;
    float Descanso;
    boolean Aquecido;

    void Metodos(){
        if (Aquecido == true) {
        System.out.println("Musculos em uso " + Day);
        System.out.println("O descanso foi de " + Descanso + "s");
        System.out.println("Quantidade total de repetições " + series);
        }
        else{
            System.out.println("Vixi não vai dar não!");
        }
    }

    void Carga(){
        if (Pesos == true) {
            System.out.println("Sua carga é " + KG + " kg");
        }
        else{
            System.err.println("Peso do corpo então!");
        }
    }
}
