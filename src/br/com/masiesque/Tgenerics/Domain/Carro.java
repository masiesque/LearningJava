package br.com.masiesque.Tgenerics.Domain;

public class Carro {
    private String name;

    public Carro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return("name: "+this.name);
    }
}
