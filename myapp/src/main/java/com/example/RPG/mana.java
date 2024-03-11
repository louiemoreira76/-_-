package com.example.RPG;

public class mana extends base {
    private byte magna;

    public void piromantico(){
        HP = (byte)1500; 
        Stamina = (byte)390; 
        Ataque = (byte)222; 
        Defesa = (byte)100; 
        NomeP = "";
        level = (byte)0; 
        Sexo = '?';
    }

    public void eletromagico(){
        HP = (byte)2500; 
        Stamina = (byte)130; 
        Ataque = (byte)360; 
        Defesa = (byte)300; 
        NomeP = "";
        level = (byte)0; 
        Sexo = '?';
    }

    public void mitico(){
        HP = (byte)2000; 
        Stamina = (byte)250; 
        Ataque = (byte)290; 
        Defesa = (byte)220; 
        NomeP = "";
        level = (byte)0; 
        Sexo = '?';
    }
}
