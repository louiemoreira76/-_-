package com.example.lesson6;

import java.util.Random;

public class Luta {
    private Lutador desafiado; //tipo abstrato de dados
    private Lutador desafiante;
    private byte rounds;
    private boolean aprovada;
    //Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategory().equals(l2.getCategory())//l1.getCategory() == l2.getCategory()
        && l1 != l2){ 
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
    
            Random ganhador = new Random();
            int vencedor = ganhador.nextInt(3); // 0, 1, 2
            System.out.println("===== Resultado da Luta ======");
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getName());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: 
                    System.out.println("Vitória do " + this.desafiante.getName());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    break;
            }
            System.out.println("================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public byte getRounds() {
        return this.rounds;
    }

    public void setRounds(byte rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
