    package com.example.Exercicios.ex4;

    public class lesson4 {
        public static void main(String[] args){
            Banco conta = new Banco();
            byte c = 0;
            char t = 'n';
            String n = "";
            float s = 0f;
            boolean e = false;

            conta.abrirConta(t, e, n, c, s);

            conta.menu();
        }
    }
