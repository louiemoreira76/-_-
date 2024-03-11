package com.example.RPG;
import java.util.Scanner;

public class escolha {
    Scanner read = new Scanner(System.in);
    protected warior w = new warior;

    boolean[] etapas = {false,false};
    byte[] decisao1 = new byte[2];
    byte[] decisao2 = new byte[3];

    do{
        System.out.println("Escolha a seguir qual tipo de Heroi que você deseja ser 1. Gurreiro 2. Mago:");
        switch (decisao1[0] = read.nextByte()) {
            case 1:
                System.out.println("Escolha o tipo de Gurreiro que você sera");
                switch () {
                    case 1:
                        w.executor();
                        break;
                    case 2: 
                        w.Paladino();
                        break;
                    case 3:
                        w.darkKnight();
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Escolha o tipo de Mago que você sera");

            default:
                break;
        }
        
    }while (etapas[0] == false);
}
