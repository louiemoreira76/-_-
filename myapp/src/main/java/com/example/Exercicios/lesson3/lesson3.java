package com.example.Exercicios.lesson3;

public class lesson3 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("faber-castell", "Roxo", 0.20f );
        Caneta c2 = new Caneta("", "Pink", 0);
        //c1.setModelo("Bick"); Metodo acessesor
        c2.modelo = "Bink"; // diretamente no atributo 
        
        c2.setPonta(0.5f);
       // c1.ponta = 1.3f; não pode pois é privado

        c1.status();        
    }
}
