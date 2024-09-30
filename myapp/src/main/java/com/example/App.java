package com.example;
import java.util.Locale;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner read = new Scanner(System.in).useLocale(Locale.US);
        int soma = 0;
        int contador = 0;

        for(int i = 1; i <= 6; i++){
            int num = read.nextInt();

            if(num > 0){
            contador++;
            System.out.println("Numero digitado Positivo: " + num);
            soma = num + soma;
            }

        }
        System.out.println(soma);
        int divisao = soma / contador;
        System.out.println("A média dos números positivos é: " + divisao);
    }
}
