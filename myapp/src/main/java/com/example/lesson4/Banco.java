package com.example.lesson4;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
        public byte numConata;
        protected char tipo;
        private String dono;
        private float saldo;
        private boolean status;
        public char opcao;

    public Banco(){

    }

    Random gerador = new Random();

    public void abrirConta(char t, boolean s, String d, byte n , float m){
        Scanner scanner = new Scanner(System.in);

              this.numConata = n;
        this.dono = d;
        this.status = s;
        this.tipo = t;

        System.out.println("Olá você vai querer abrir uma conta?");
        System.out.println("Digite S para sim ou N para não:");
        opcao = scanner.next().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            do {
                System.out.println("Escolha 'C' para Conta Corrente ou 'P' para Poupança?");
                t = scanner.next().charAt(0);

                if (t != 'C' && t != 'c' && t != 'P' && t != 'p') {
                    System.out.println("Escolha inconsistente! Selecione 'C' para Conta Corrente ou 'P' para Poupança?");
                }
            } while (t != 'C' && t != 'c' && t != 'P' && t != 'p');

            if (t == 'C' || t == 'c') {
                saldo += 50;
                s = true;
            }
            if (t == 'P' || t == 'p') {
                saldo += 150;
                s = true;
            }

            System.out.println("Que bom! Digite seu nome: ");
            d = scanner.next();

            for (byte i = 0; i < 10; i++) {
                byte gerandoNconta = (byte) gerador.nextInt();
                n = gerandoNconta;
            }
        } else {
            System.out.println("OK atendimento encerrado!");
        }
            }

            public void Depositar() {
                Scanner scanner = new Scanner(System.in);
            
                System.out.println("Digite quanto você quer depositar:");
                float deposito = scanner.nextFloat();
            
                if (deposito <= 0) {
                    System.err.println("Não foi possível realizar o depósito :(");
                } else {
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
                }
            }
            
            public void Sacar() {
                Scanner scanner = new Scanner(System.in);
            
                System.out.println("Digite quanto você quer sacar:");
                float saque = scanner.nextFloat();
            
                if (saque > saldo) {
                    System.out.println("Você ultrapassou seu valor de saque!");
                } else if (saque <= 0) {
                    System.err.println("Não foi possível sacar :(");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
                }
            }
            
            public void Taxa() {
                Scanner scanner = new Scanner(System.in);
            
                System.out.println("Digite o tipo de conta ('C' para Conta Corrente, 'P' para Poupança):");
                char tipoConta = scanner.next().charAt(0);
            
                float taxa = (tipoConta == 'C' || tipoConta == 'c') ? 12.00f : 20.00f;
            
                if (saldo < taxa) {
                    System.out.println("Não foi possível, saldo insuficiente!");
                } else {
                    saldo -= taxa;
                    System.out.println("Taxa paga com sucesso. Novo saldo: " + saldo);
                }
            }
            
            public void fecharConta() {
                Scanner scanner = new Scanner(System.in);
            
                System.out.println("Tem certeza que quer fechar a conta?\nDigite 'SIM' se sim, senão digite 'N'!");
                String decisao = scanner.next();
            
                if (decisao.equals("SIM")) {
                    status = false;
                    System.out.println("Conta fechada com sucesso!");
                } else {
                    System.out.println("Operação cancelada.");
                }
            }

    public void menu() {
        ArrayList<Byte> opcoes = new ArrayList<Byte>();
        opcoes.add((byte) 1);
        opcoes.add((byte) 2);
        opcoes.add((byte) 3);
        opcoes.add((byte) 4);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Depositar\n2. Sacar\n3. Pagar Taxa\n4. Fechar Conta\n0.  Voltar");
            System.out.println("Digite o número correspondente à opção que você deseja:");
            byte opcaoDigitada = scanner.nextByte();

            switch (opcaoDigitada) {
                case 1:
                    Depositar();
                    break;
                case 2:
                    Sacar();;
                    break;
                case 3:
                    Taxa();;
                    break;
                case 4:
                    fecharConta();;
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (status == true); // O loop é infinito; você pode adicionar uma condição de saída se necessário.
    }

    
}
