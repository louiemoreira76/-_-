package com.example.Exercicios.lesson6;

public class Lutador {
    // atributos
    private String name;
    private String nationality;
    private byte age;
    private float height;
    private float weight;
    private String category;
    private byte victories;
    private byte defeats;
    private byte draws;

    // método construtor
    public Lutador(String n, String N, byte a, float h, float w, byte v, byte d, byte e) {
        // Inicialize os atributos no construtor, se necessário
        this.setName(n);
        this.setNationality(N);
        this.setAge(a);
        this.setHeight(h);
        this.setWeight(w);
        this.setVictories(v);
        this.setDefeats(d);
        this.setDraws(e);
        setCategory();
    }

    // métodos getter e setter para name
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    // métodos getter e setter para nationality
    public String getNationality() {
        return this.nationality;
    }
    public void setNationality(String N) {
        this.nationality = N;
    }
    // métodos getter e setter para age
    public byte getAge() {
        return this.age;
    }
    public void setAge(byte a) {
        this.age = a;
    }
    // métodos getter e setter para height
    public float getHeight() {
        return this.height;
    }
    public void setHeight(float h) {
        this.height = h;
    }
    // métodos getter e setter para weight
    public float getWeight() {
        return this.weight;
    }
    public void setWeight(float w) {
        this.weight = w;
    }
    // métodos getter e setter para category
    public String getCategory() {
        return this.category;
    }
    private void setCategory() {
        float p = this.weight;
        if (p < 52.2) {
            System.out.println("Peso abaixo do mínimo. Categoria não definida.");
            return;
        }
        else if(p <= 70.3) {
            this.category = "Leve";
        }
        else if(p <= 83.9){
        this.category = "Médio";
        }
        else if(p <= 120.2){
            this.category = "Pesado";
        }
        else{
            System.out.println("Thais carla saía!!!");
            return;
        }
    }
    // métodos getter e setter para victories
    public byte getVictories() {
        return this.victories;
    }
    public void setVictories(byte v) {
        this.victories = v;
    }
    // métodos getter e setter para defeats
    public byte getDefeats() {
        return this.defeats;
    }
    public void setDefeats(byte d) {
        this.defeats = d;
    }
    // métodos getter e setter para draws
    public byte getDraws() {
        return this.draws;
    }
    public void setDraws(byte e) {
        this.draws = e;
    }
    //metodos com ações
    public void ganharLuta(){
        setVictories((byte) (getVictories() + 1));
    }
    public void perderLuta(){
        setDefeats((byte) (getDefeats() + 1));
    }
    public void empatarLuta(){
        setDraws((byte) (getDraws() + 1));
    }

    public void apresentar(){
        System.out.println("Prazer meu nome é " + getName());
        System.out.println("Nasci no pais " + getNationality());
        System.out.println("Minha iadade é " + getAge());
        System.out.println("Tenho " + getHeight() + " de altura");
        System.out.println("Peso " + getWeight() + "kg");
        System.out.println("Então minha categoria é peso " + getCategory());
    }

    public void status(){
        System.out.println("O poderoso " + getName());
        System.out.println("\n Minhas vitorias: " + getVictories() + "\n Derrotas: " + getDefeats() + "\n Empates: " + getDraws());
    }
}
