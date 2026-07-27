package br.com.masiesque.Tgenerics.Service;

import br.com.masiesque.Tgenerics.Domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Masseratti")));

    public Carro buscaCarroDisponivel ()
    {
        Carro carroBusca= carrosDisponiveis.remove(0);
        System.out.println( "Carro disponível: "+carroBusca);
        return carroBusca;
    }

    public void devolvendoCarro(Carro carro)
    {
        carrosDisponiveis.add(carro);
        System.out.println("Lista de carros:\n");
        for (Carro cd : carrosDisponiveis) {
            System.out.println(cd.getName());
        }
    }
}
