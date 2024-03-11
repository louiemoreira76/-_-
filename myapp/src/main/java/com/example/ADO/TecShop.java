package com.example.ADO;


import java.util.List;
import java.util.ArrayList;

public class TecShop {

    private List<Produto> pecasComputador;
    private List<Produto> pecasNotebook;
    private List<Produto> perifericos;
    private List<Produto> memorias;
    protected List<Produto> carrinho;

    public void Loja(){
        
        // Inicialize as listas de produtos para cada categoria
        pecasComputador = new ArrayList<>();
        pecasNotebook = new ArrayList<>();
        perifericos = new ArrayList<>();
        memorias = new ArrayList<>();
        carrinho = new ArrayList<>();

         // Adicione alguns produtos às listas (você pode adicionar mais conforme necessário)
        pecasComputador.add(new Produto("Placa-mãe Aorus", "PLACA MAE (AMD) GIGABYTE B550 AORUS ELITE AX V2 DDR4 AM4", 1000.0));
         pecasComputador.add(new Produto("Processador", "Intel core i9 13900KF", 3000.0));
 
         pecasNotebook.add(new Produto("Teclado para notebook", "Descrição do teclado", 50.0));
         pecasNotebook.add(new Produto("Bateria para notebook", "Descrição da bateria", 80.0));
 
         perifericos.add(new Produto("Mouse", "Descrição do mouse", 20.0));
         perifericos.add(new Produto("Monitor", "Descrição do monitor", 150.0));
 
         memorias.add(new Produto("Memória RAM", "Descrição da memória RAM", 80.0));
         memorias.add(new Produto("HD", "Descrição do HD", 100.0));
    }

    // Getter e Setter para pecasComputador
    public List<Produto> getPecasComputador() {
        return pecasComputador;
    }

    public void setPecasComputador(List<Produto> pecasComputador) {
        this.pecasComputador = pecasComputador;
    }

    // Getter e Setter para pecasNotebook
    public List<Produto> getPecasNotebook() {
        return pecasNotebook;
    }

    public void setPecasNotebook(List<Produto> pecasNotebook) {
        this.pecasNotebook = pecasNotebook;
    }

    // Getter e Setter para perifericos
    public List<Produto> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(List<Produto> perifericos) {
        this.perifericos = perifericos;
    }

    // Getter e Setter para memorias
    public List<Produto> getMemorias() {
        return memorias;
    }

    public void setMemorias(List<Produto> memorias) {
        this.memorias = memorias;
    }
}
