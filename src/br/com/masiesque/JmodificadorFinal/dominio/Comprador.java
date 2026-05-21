package br.com.masiesque.JmodificadorFinal.dominio;

public class Comprador {
    private String name;

    @Override
    public String toString() {
        return "Comprador{nome='" + name + "'}";
    }

    //getter e setters
    public String getName()
    {
        return this.name;
    }
    public void setName(String nomezinho)
    {
        name = nomezinho;
    }

}
