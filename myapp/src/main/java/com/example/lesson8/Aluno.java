package com.example.lesson8;

public class Aluno extends Pessoa{ //herança
    private byte mat;
    private String curso;

    public void cancelarMatr(){

    }

    public byte getMat() {
        return mat;
    }
    public void setMat(byte mat) {
        this.mat = mat;
    }
    // Métodos getter e setter para 'curso'
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
