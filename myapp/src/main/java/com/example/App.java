package com.example;

import java.util.ArrayList;
import javax.print.DocFlavor.STRING;

public class App 
{
    public static void main( String[] args ){
        System.out.println("Hello World!" );

        //short, int, long
        byte age = 19;

        char P = 'L';

        boolean lindo = true;

        String nome = "Luis";

        //tem double tambem
        float salario = 1350.67F;

        ArrayList<Integer> skins = new ArrayList<Integer>();
        skins.add(80);
        skins.remove(0);
        skins.get(0);
        skins.size();

        //int[] skins = {3,3,3}; //inicializando assim
        //int[] skins = new int[10]; //iniciou o array

        if (age >= 19) {
            System.out.println(nome);
        }

        for(int i = 0; i < age; i++){
            System.out.println(P);
        }

        while (lindo == true) {
            System.out.println("Maravinhoso!");
        }

        //casting Implicito
        int amuwr = 0;
        double amuwro = amuwr;

        //casting explicito
        amuwr = (int) amuwro;

        char letra = 'a';
        String food = String.valueOf(letra);

        letra = food.charAt(0);
        String guspe = String.valueOf(amuwr);
    }
}
