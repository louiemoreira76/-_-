package com.example.lesson9;

public class Aluno extends Pessoa {
    private byte matricula;
    private String curso;

    public void pagMensal(){
        System.out.println("Pagando mensalidade de aluno" + this.nome); //pq tá protrgido apenas qm n ta com acesso a classe Pessoa
                                                                        //private getName()
    }

    public byte getMatricula() {
        return matricula;
    }
    public void setMatricula(byte matricula) {
        this.matricula = matricula;
    }
    // Métodos getter e setter para 'curso'
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}