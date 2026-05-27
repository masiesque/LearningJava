package br.com.masiesque.Jpolimorfismo.service;
import br.com.masiesque.Jpolimorfismo.domain.Produto;
import br.com.masiesque.Jpolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calculoImposto(Produto product) {
        System.out.println("Calculando imposto do Produto.....");
        double result = product.calcularImposto();
        System.out.println("Imposto do " + product.getName() + ": " + result);

        if(product instanceof Tomate)
        {
            Tomate tomate = (Tomate)product;
            System.out.println("Data de validade:"+ tomate.getValidade());
        }
    }


}



//deixamos o metodo estático(pois não usamos nenhum atributo da classe), para nao precisarmos instanciar ele como objeto
//apenas usamos ele chamando a classe já inicializada pela JVM.


