package com.example.Calculadora;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    private ArrayList<Float> numeros = new ArrayList<>();
    private ArrayList<Character> operacao = new ArrayList<>();
    private Boolean parar = false; 

    Scanner read = new Scanner(System.in);
    //em tempo real
    public void Decisao(){
        do {
            if (continuar() || numeros.size() != 100) {
                System.out.println("Digite o próximo número:");
                digitosN();
                if (!continuar()) {
                    System.out.println("Deseja realizar uma operação? (Sim/Nao)");
                    String resposta = read.next();

                    while (!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("Nao"))  {
                        resposta = "";
                        System.out.println("Não foi compreendido a opção que você deseja, digite uma dessas opções: (Sim/Nao)");
                        resposta = read.next();
                    }

                    if (resposta.equalsIgnoreCase("Não")) {
                        parar = true;
                    } else {
                        System.out.println("Digite o sinal da operação (+ - * /):");
                        digitosO();
                    }
                }
            } else { //hum
                System.out.println("Digite um próximo número:");
                digitosN();
            }
    
            if (numeros.size() > operacao.size()) {
                System.out.println("Deseja realizar mais uma operação? (Sim/Não)");
                String resposta = read.next();
                if (resposta.equalsIgnoreCase("Nao")) {
                    parar = true;
                } else {
                    System.out.println("Digite o sinal da operação (+ - * /):");
                    digitosO();
                }
            }
        } while (parar == false);
        calculo();
    
    }

    public void digitosN(){
           float n = read.nextFloat();
           numeros.add(n);
    }

    public void digitosO(){
        char o = read.next().charAt(0);
        if (o != '\n') {
            while (o != '+' && o != '-' && o != '*' && o != '/') {
                o = ' '; //char vazio
                System.out.println("Não foi compreendido a opção que você deseja, digite uma dessas opções: (+ - * /)");
                o = read.next().charAt(0);
            }
        }
        operacao.add(o);
    }

    public int posicaoChar(){
    int tamanho = operacao.size();
    if (tamanho > 0) {
        return tamanho - 1;
    } else {
        return -1; // Retorna -1 se o ArrayList estiver vazio
    }
    }

    public Boolean continuar(){
        return numeros.size() > 0 && operacao.size() > 0 && numeros.size() > operacao.size();
    }

    public void calculo(){
        float resultado = numeros.get(0);
        for(short i = 0; i < operacao.size(); i++){
        char operador = operacao.get(i);
        float proximoN = numeros.get(i + 1);

        switch (operador) {
            case '+':
                resultado += proximoN;
                break;
            case '-':
                resultado -= proximoN;
                break;
            case '*':
                resultado *= proximoN;
                break;
            case '/':
                if (proximoN != 0) {
                    resultado /= proximoN;
                }
                else{
                    System.out.println("Ocorreu um Erro pois vc tentou dividir por zero!");
                }
                break;
            default:
                System.out.println("Operação invalida: " + operador);
               return;
        }
        System.out.println("Resultado dessa Super Equação: " + resultado);
        }
    }

}
