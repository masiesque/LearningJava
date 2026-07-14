package br.com.masiesque.Tgenerics.Test;

import br.com.masiesque.Tgenerics.Domain.Barco;
import br.com.masiesque.Tgenerics.Domain.Carro;
import br.com.masiesque.Tgenerics.Service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro>listCar = new ArrayList<>(List.of(new Carro("Porshe"), new Carro("Ferrari")));
        List<Barco>listShip = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Caravela")));
        RentavelService<Carro> rentavelServiceCar = new RentavelService<>(listCar);
        Carro carro = rentavelServiceCar.buscaObjDisponivel();
        rentavelServiceCar.devolvendoObjeto(carro);
        System.out.println("-------------------");
        Carro carro1 = rentavelServiceCar.buscaObjDisponivel();
        rentavelServiceCar.devolvendoObjeto(carro1);

    }
}
