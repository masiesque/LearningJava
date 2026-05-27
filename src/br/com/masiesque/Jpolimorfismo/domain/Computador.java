package br.com.masiesque.Jpolimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.021;

    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO_POR_CENTO;
    }

}
