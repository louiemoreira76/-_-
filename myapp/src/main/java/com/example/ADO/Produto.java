package com.example.ADO;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    
    public Produto(String nome, String descricao, double preco) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        }
    
        public String getNome() {
            return this.nome;
        }
        
        public void setNome(String n){
            this.nome = n;
        }

        public String getDescricao() {
            return this.descricao;
        }

        public void setDescricao(String d){
            this.descricao = d;
        }
    
        public double getPreco(){
            return this.preco;
        }

        public void setPreco(double p){
            this.preco = p;
        }
}
