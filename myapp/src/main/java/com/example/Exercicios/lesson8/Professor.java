package com.example.Exercicios.lesson8;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    // Métodos getter e setter para 'salario'
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
