package com.example.livro;

import java.time.LocalDate;

public abstract class Recurso {
    private String titulo;
    private String autor; 
    private LocalDate datapublicacao;

    public Recurso(String t, String a, LocalDate d){
        this.titulo = t;
        this.autor = a;
        this.datapublicacao = d;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public LocalDate getDataPublicacao(){
        return datapublicacao;
    }
    public void setDataPublicacao(LocalDate d){
        this.datapublicacao = d;
    }
}
