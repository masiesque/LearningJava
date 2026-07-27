package br.com.masiesque.Jpolimorfismo.domain;

public abstract class Produto implements Taxavel {
    protected String name;
    protected  double  valor;

    public Produto(String name, double valor)
    {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public double getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return "Nome: "+name+"\nValor: "+valor;
    }
}
