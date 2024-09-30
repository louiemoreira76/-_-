package com.example.Exercicios.lesson8;

public class Pessoa {
    private String nome;
    private byte idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Métodos getter e setter para 'idade'
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    // Métodos getter e setter para 'sexo'
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo" + sexo + "}";
    }
}
