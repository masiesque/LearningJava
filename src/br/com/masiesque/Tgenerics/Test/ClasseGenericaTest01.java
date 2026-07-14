package br.com.masiesque.Tgenerics.Test;

import br.com.masiesque.Tgenerics.Domain.Carro;
import br.com.masiesque.Tgenerics.Service.CarroRentavelService;

public class ClasseGenericaTest01 {

    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponivel();
        System.out.println("1 mes depois");
        carroRentavelService.devolvendoCarro(carro);
    }
}
