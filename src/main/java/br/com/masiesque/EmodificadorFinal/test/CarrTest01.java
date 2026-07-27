package br.com.masiesque.EmodificadorFinal.test;

import br.com.masiesque.EmodificadorFinal.dominio.Carro;

public class CarrTest01 {
    public static void main(String[] args) {
        Carro car = new Carro();

        //car.VELOCIDADE_LIMIT;-> Não é correto acessar variáveis static pela variável instanciada
        //Carro.VELOCIDADE_LIMIT;-> A maneira correta é chamar a variável public static, pela própria class public

        System.out.println(Carro.VELOCIDADE_LIMIT);
        Carro carro = new Carro();
        carro.COMPRADOR.setName("Mazda");
        //System.out.println(carro.COMPRADOR.getName()); OU
        System.out.println(carro.COMPRADOR);//nem precisamos chamar o metodo toString, pq o println da JVM por padrão vê
        //que se trata de um objeto a ser printado e chama function que transforma obj em string que é toString
    }
}
//observação: Podemos também colocar o modificador final em classes e métodos;
// Classes-> tornam elas impossíveis de extender
//Métodos-> tornam eles impossíveis de Overrride;