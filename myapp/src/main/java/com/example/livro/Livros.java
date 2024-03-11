package com.example.livro;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Livros extends Recurso {
    private List<Livros> Drama;
    private List<Livros> Romance;
    private List<Livros> Aventura;
    private List<Livros> Terror;
    private List<Livros> FiccaoCientifica;
    private List<Livros> Fantasia;
    private List<Livros> Suspense;
    private List<Livros> Policial;

    public Livros(String titulo, String autor, LocalDate dataPublicacao) {
        super(titulo, autor, dataPublicacao);
        this.Drama = new ArrayList<>();
        this.Romance = new ArrayList<>();
        this.Aventura = new ArrayList<>();
        this.Terror = new ArrayList<>();
        this.FiccaoCientifica = new ArrayList<>();
        this.Fantasia = new ArrayList<>();
        this.Suspense = new ArrayList<>();
        this.Policial = new ArrayList<>();
    }
}

