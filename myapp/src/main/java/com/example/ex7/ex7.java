package com.example.ex7;

public class ex7 {
    
    public static void main(String[] args) {
        Pessoa y = new Pessoa();
        Publicacao p = new Livro();
        Livro ds = new Livro();

        y.setNome("Eduarda");
        y.setIdade((byte) 19);
        y.setSexo('F');
        y.fazerAniver();

        ds.setTotPaginas((short) 300);

        p.abrir();
        p.folhear();
        p.voltarPag();
        p.avancarPag();
        p.fechar();

         ds.detalhes();
    }
}
