package br.com.masiesque.Tgenerics.Test;

import br.com.masiesque.Tgenerics.Domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {

    public static void main(String[] args) {

        criarArrayListDeObjts(new Carro("Mecedez"), new Carro("BMW"));
    }

    private static <T> void criarArrayListDeObjts(T t,T x)
    {
        List<T> arrayRandom = new ArrayList<>(List.of(x,t));
        System.out.println(arrayRandom);


    }

}
