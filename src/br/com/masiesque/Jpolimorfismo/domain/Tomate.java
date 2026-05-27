package br.com.masiesque.Jpolimorfismo.domain;

public class Tomate extends Produto{
    private static final double IMPOSTO_PORCENTO = 0.5;
    private String validade = "12/05/2026";

    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO_PORCENTO;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
