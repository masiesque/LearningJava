package br.com.masiesque.Isobrescrista.domain;

public class Anime extends Object {
    private String nome;

    @Override
    public String toString() {
        return "Anime: "+ nome;
    }

    //construtor:
    public Anime(String nome){
        this.nome = nome;
    }
    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
