package com.example.lesson8;

public class lesson8 {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setIdade((byte)30);

        p2.setCurso("Informatica");
        p3.setSalario(400f);
        p4.setSetor("Estoque");

        p3.receberAumento(700f);//Todo filho faz coisa que mãe NÃO faz, mas tbm faz oq mãe faz
        //ou seja essa função pertece a subclasse funcinario
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
//22