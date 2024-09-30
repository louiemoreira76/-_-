package com.example.Exercicios.lesson8;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    // Métodos getter e setter para 'trabalhando'
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
