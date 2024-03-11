package com.example.RPG;

public abstract class base {
    protected byte HP;
    protected byte Stamina;
    protected byte Ataque;
    protected byte Defesa;
    protected String NomeP;
    protected float level;
    protected char Sexo;

    public Estudante(byte HP, byte Stamina, byte Ataque) {
        this.HP = HP;
        this.Stamina = Stamina;
        this.Ataque = Ataque;//...
    }

    public abstract void Defender();
    public abstract void Desviar();
    public abstract byte GolpeWeak();
    public abstract byte GolpeMiddle();
    public abstract byte GolpeStrong();
    public abstract void Especial();
}
