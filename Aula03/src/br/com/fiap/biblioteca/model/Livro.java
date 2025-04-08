package br.com.fiap.biblioteca.model;

public class Livro {

    //atributos
    public String titulo;
    int paginas;
    int ano;
    boolean disponivel;
    String categoria;

    //métodos
    void emprestar(){
        disponivel = false;
    }

}
