package br.com.masiesque.JmodificadorFinal.test;

import br.com.masiesque.JmodificadorFinal.dominio.Carro;

public class CarrTest01 {
    public static void main(String[] args) {
        Carro car = new Carro();

        //car.VELOCIDADE_LIMIT;-> Não é correto acessar variáveis static pela variável instanciada
        //Carro.VELOCIDADE_LIMIT;-> A maneira correta é chamar a variável public static, pela própria class public

        System.out.println(Carro.VELOCIDADE_LIMIT);
    }
}
