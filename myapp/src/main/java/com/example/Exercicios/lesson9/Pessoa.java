package com.example.Exercicios.lesson9;

public abstract class Pessoa {
    protected String nome;
    protected byte idade;
    protected String sexo;

    public void fzrAniversario(){
        this.idade ++;
    }

        // Métodos getter e setter para 'nome'
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        // Métodos getter e setter para 'idade'
        public byte getIdade() {
            return idade;
        }
        public void setIdade(byte idade) {
            this.idade = idade;
        }
        // Métodos getter e setter para 'sexo'
        public String getSexo() {
            return sexo;
        }
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", sexo='" + sexo + '\'' +
                    '}';
        }
}
