package com.example.lesson9;

public final class Bolsista extends Aluno{
    protected float bolsa;

    public void renovar(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    public void bolsa(float valor) {
        this.bolsa = valor;
        System.out.println("Bolsa no valor de " + valor + " concedida para " + this.nome);
    }

    //tem que sobre posto no mensalidade do aluno
    @Override
    public void pagMensal(){
        System.out.println(this.nome + " é bolsista! pagamento realizado");
    }
}
