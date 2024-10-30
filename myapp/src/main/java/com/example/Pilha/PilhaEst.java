package com.example.Pilha;

public class PilhaEst {
    public Object pil []; // vetor de objetos
    public int topo; // posição do topo
    public int max; // tamanho limite
    public int tamanho = 0; // tamanho preenchido

    public PilhaEst(int max) {
        this.max = max;
        this.topo = max;
        pil = new Object[max];
    }


    public Object[] getPil() {
        return pil;
    }
    public void setPil(Object[] pil) {
        this.pil = pil;
    }
    public int getTopo() {
        return topo;
    }
    public void setTopo(int topo) {
        this.topo = topo;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
