package com.example.ADO;

import java.util.Scanner;

public class EscolhaUsuario {
   
    Scanner scanner = new Scanner(System.in);

    protected int obterEscolhaUsuario(int opcoes) {
        int escolha = 0;
        while (escolha < 1 || escolha > opcoes) {
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            if (escolha < 1 || escolha > opcoes) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        return escolha;
    }
    
    protected int obterEscolhaProduto(int quantidadeProdutos) {
        int escolha = 0;
        while (escolha < 1 || escolha > quantidadeProdutos) {
            System.out.print("Escolha o número do produto: ");
            escolha = scanner.nextInt();
            if (escolha < 1 || escolha > quantidadeProdutos) {
                System.out.println("Número do produto inválido. Tente novamente.");
            }
        }
        return escolha;
    }
}
