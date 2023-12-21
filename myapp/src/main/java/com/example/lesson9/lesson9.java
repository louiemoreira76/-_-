package com.example.lesson9;

public class lesson9 {
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa(); não pode instanciar classe abstrata
        //Visitante v1 = new Visitante(); //Herança pobre
        //v1.setNome("Juvenal");
        //v1.setIdade((byte)89);
        //v1.setSexo("Macho");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno(); //herança para diferença, especialização de Pessoa
        a1.setNome("Lloris");
        a1.setMatricula((byte)1111);
        a1.setCurso("Informatica");
        a1.setSexo("Masculo");
        a1.setIdade((byte)19);
        System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.bolsa(1324f);
        b1.setMatricula((byte)23443);
        b1.setNome("Arduíno");
        b1.setSexo("Prefiro n dizer");
        b1.pagMensal(); //sobre posição
    }
}//não se herda de class com final pois não tem finho
