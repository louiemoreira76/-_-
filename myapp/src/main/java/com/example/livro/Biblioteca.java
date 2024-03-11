package com.example.livro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<Recurso, Boolean> recursosDisponiveis;
    private ArrayList<Esprestimo> emprestimos; 
    private double taxaDiaria;

    public Biblioteca(double taxaDiaria){
        recursosDisponiveis = new HashMap<>();
        emprestimos = new ArrayList<>();
        this.taxaDiaria = taxaDiaria;
    }

    public void adicionarRecurso(Recurso recurso) {
        recursosDisponiveis.put(recurso, true);
    }
}
