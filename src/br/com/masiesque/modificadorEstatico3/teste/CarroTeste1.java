package br.com.masiesque.modificadorEstatico3.teste;

import br.com.masiesque.modificadorEstatico3.domain.Carro;

public class CarroTeste1{
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",302);
//        Carro c2 = new Carro("Mustang-GT",240);
//        Carro c3  = new Carro("Porsche 911 manual",350);
//
//        c1.printAll();
//        c2.printAll();
//        c3.printAll();
        System.out.println(Carro.getVolLim());
        Carro.setVolLim(130);
        System.out.println(Carro.getVolLim());


    }
}