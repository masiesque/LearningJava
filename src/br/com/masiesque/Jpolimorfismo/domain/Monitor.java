package br.com.masiesque.Jpolimorfismo.domain;

public class Monitor extends Computador{
    public static final double IMPOSTO_POR_CENTO = 0.013;

    public Monitor(String name, double valor) {
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
