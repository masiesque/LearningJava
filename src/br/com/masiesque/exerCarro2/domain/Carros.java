package br.com.masiesque.exerCarro2.domain;

public class Carros implements AutoMoveis {
    //atributos:
    private String name;
    private String modelo;
    private int ano;


    //construtor:
    public Carros(String name, int codModelo, int ano)
    {
        this.name = name;
        if(codModelo == 1) this.modelo ="pegeout";
        if(codModelo == 2) this.modelo ="citroen";
        if(codModelo == 3) this.modelo ="nissan";
        if(codModelo == 4) this.modelo ="mitsubishi";
        if(codModelo == 5) this.modelo ="volks";
        this.ano = ano;

    }


    //setter e getter's:

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void showConfig() {
        System.out.format("\nCarro:%s ano:%d  modelo:%s\n",name,ano,modelo);
    }
}
