package br.com.masiesque.Tgenerics.Service;

import java.util.List;

public class RentavelService<T>
{
    List<T> objetosDispoiveis;


        public RentavelService( List<T>objetosDispoiveis ) {
            this.objetosDispoiveis = objetosDispoiveis;
        }


    public T buscaObjDisponivel ()
    {
        T t= objetosDispoiveis.remove(0);
        System.out.println( "Objeto disponível: "+t);
        return t;
    }

    public void devolvendoObjeto(T t)
    {
        objetosDispoiveis.add(t);
        System.out.println("Lista de carros:\n");
        for (T t1 : objetosDispoiveis) {
            System.out.println(t1);
        }
    }
}

