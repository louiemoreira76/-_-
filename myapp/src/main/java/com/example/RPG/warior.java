package com.example.RPG;

public final class warior extends base{
    private byte abilitle;

    public void executor(){
        HP = (byte)1500; 
        Stamina = (byte)390; 
        Ataque = (byte)222; 
        Defesa = (byte)100; 
        NomeP = "";
        level = (byte)0; 
        Sexo = '?';
    }
    public class Paladino {
        HP = (byte)2500; 
        Stamina = (byte)130; 
        Ataque = (byte)360; 
        Defesa = (byte)300; 
        NomeP = "";
        level = (byte)0; 
        Sexo = '?';
    }
    public class darkKnight {
        HP = (byte)2000; 
        Stamina = (byte)250; 
        Ataque = (byte)290; 
        Defesa = (byte)220; 
        NomeP = "";
        level = (byte)0; 
        Sexo = '?';
    }

    @Override
    public void Defender(){

    }
    @Override 
    public void Desviar(){

    }
    @Override
    public byte GolpeWeak(){
        byte dano = (byte)(Ataque - 50);
        return dano;
    }

    @Override
    public byte GolpeMiddle() {
        byte dano = (byte)Ataque;
        return dano;
    }

    @Override
    public byte GolpeStrong(){
        byte dano = (byte)(Ataque + 50);
    }
    @Override
    public void Especial(){
        
    }
}

// @Override
// public void Defender(){

// }