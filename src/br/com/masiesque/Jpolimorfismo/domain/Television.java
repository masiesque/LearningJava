package br.com.masiesque.Jpolimorfismo.domain;

public class Television extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.50;
    public Television(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO_POR_CENTO;
    }
}
