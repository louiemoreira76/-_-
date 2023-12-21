package com.example.ex7;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private short totPaginas;
    private short pagAtual;
    private boolean aberto;
    private String leitor;

    Pessoa f = new Pessoa();

       // Métodos getter e setter para 'titulo'
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // Métodos getter e setter para 'autor'
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // Métodos getter e setter para 'totPaginas'
    public short getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(short totPaginas) {
        this.totPaginas = totPaginas;
    }
    // Métodos getter e setter para 'pagAtual'
    public short getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(short pagAtual) {
        this.pagAtual += pagAtual;
    }
    // Métodos getter e setter para 'aberto'
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    // Métodos getter e setter para 'leitor'
    public String getLeitor() {
        return this.leitor = f.getNome();
    }
    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        f.fazerAniver();
        System.out.print("Nome do livro: " + getTitulo());
        System.out.println("Autor " + getAutor());
        System.out.println("Quantas páginas no total: " + getTotPaginas());
        System.out.println("Pagina atual: " + getPagAtual());
        System.out.println("Tá aberto: " + isAberto());
        System.out.println("Eu " + getLeitor() + " estou lendo!");
    }

    //Métodos Abstratos
    @Override
    public void abrir(){
     this.setAberto(true);
    }

    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void folhear(){
        this.setPagAtual((short) 15);
    }

    public void avancarPag(){
        this.setPagAtual((short) 1);
    }

    public void voltarPag(){
        this.setPagAtual((short) -1);
    }
}
