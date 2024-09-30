package com.example.Exercicios.ex7;
//n precisa do -abstract- pois as interfaces já são implicitamente abstratas.
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear();
    public abstract void avancarPag();
    public abstract void voltarPag();
}
