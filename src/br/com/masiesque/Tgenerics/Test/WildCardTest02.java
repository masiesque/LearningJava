package br.com.masiesque.Tgenerics.Test;

import java.util.List;

public class WildCardTest02 {


    public static void main(String[] args) {

        List<Animal> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(),new Gato());

        printConsulta(gatos);
        System.out.println("============");
        printConsulta(cachorros);

    }
        private static void printConsulta(List<?extends Animal> animals)
        {
            for (Animal animal : animals)
                animal.consulta();
        }

//        private static void printCounsultaPrint(List<?super Animal>animals)
//        {
//            for (Object animal : animals)
//                animal.consulta();
//        }

}
