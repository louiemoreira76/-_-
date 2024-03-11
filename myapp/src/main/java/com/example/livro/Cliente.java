package com.example.livro;
import java.util.Random;

public class Cliente {
    private String Nome;
    private short Codigo;

    public Cliente(String nome, short codigo){
        this.Nome = nome;
        this.Codigo = codigo;
    }

    public String getNome(){
        return Nome;
    }
    public void setNome(String n){
        this.Nome = n;
    }
    public short getCodigo(){
        return Codigo;
    }
    public void setCodigo(short c){
        this.Codigo = c;
    }

    Random gerador = new Random();
}
