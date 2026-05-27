package br.com.masiesque.Jpolimorfismo.test;
import br.com.masiesque.Jpolimorfismo.domain.Computador;
import br.com.masiesque.Jpolimorfismo.domain.Monitor;
import br.com.masiesque.Jpolimorfismo.domain.Produto;
import br.com.masiesque.Jpolimorfismo.domain.Tomate;
import br.com.masiesque.Jpolimorfismo.service.CalculadoraImposto;

public class Tes02 {

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 3", 1500);
        Produto produto1 = new Monitor("Azus 2", 2000);
        Tomate tomate = new Tomate("tomate holandes", 10);
        CalculadoraImposto.calculoImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calculoImposto(produto);


    }

}
