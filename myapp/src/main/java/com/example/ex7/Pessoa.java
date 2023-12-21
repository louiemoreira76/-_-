package com.example.ex7;

public class Pessoa {
    private String nome;
    private byte idade;
    private char sexo;

    public void fazerAniver(){
        this.idade++; //+1
        System.out.println(getNome() + "Eu tenho " + getIdade() + " anos e meu sexo é " + getSexo());
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public byte getIdade(){
        return this.idade;
    }
    public void setIdade(byte i){
        this.idade = i;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char s){
        this.sexo = s;
    } 
}
//45