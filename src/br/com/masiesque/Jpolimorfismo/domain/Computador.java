package br.com.masiesque.Jpolimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.021;

    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Getting ready ....");
        return valor * IMPOSTO_POR_CENTO;
    }

    @Override
    public String toString() {
        return "Nome: "+name+"\nValor: "+valor;
    }
}
