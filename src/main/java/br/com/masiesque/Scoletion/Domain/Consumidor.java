package br.com.masiesque.Scoletion.Domain;

public class Consumidor {

    private String name;

    public Consumidor(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

}
