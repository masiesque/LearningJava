package br.com.masiesque.Bassocicao.domain;

public class Time {
    private String name;
    private Jogador[] jogadores;

    //construtores:
    public Time(String name)
    {
        this.name = name;
    }
    public Time(String name, Jogador[]jogadores)
    {
        this.name = name;
        this.jogadores = jogadores;
    }
    //metodos especificos:
    public void imprimir()
    {
        System.out.println("Time:"+ name);
        if(jogadores == null)
        {
            System.out.println("Não tem jogadores nao time, atualmente.");
            return;
        }
        System.out.println("Lista de jogadores abaixo:");
        for(Jogador players : jogadores)
            System.out.println(players.getName());
    }

    //getters e setters:
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public Jogador[] getJogadores()
    {
        return this.jogadores;
    }
    public void setJogadores(Jogador[]jogadores)
    {
        this.jogadores= jogadores;
    }
}
