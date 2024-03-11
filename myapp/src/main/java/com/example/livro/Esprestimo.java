package com.example.livro;

import java.time.LocalDate;

public class Esprestimo {
    private Cliente cliente;
    private Recurso recurso;
    private LocalDate dataRetorno;
    protected float dataDiaria = 20.00f;

    public Emprestimo(Cliente cliente, Recurso recurso, LocalDate dataRetorno) {
        this.cliente = cliente;
        this.recurso = recurso;
        this.dataRetorno = dataRetorno;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public float calculaMulta(LocalDate dataAtual, float dataDiaria){
        long diasAtraso = LocalDate.now().until(dataRetorno).getDays();
        if (diasAtraso > 0) {
            dataDiaria = dataDiaria * diasAtraso;
            return dataDiaria;
        }
        else{
            return 0;
        }
    }
}
