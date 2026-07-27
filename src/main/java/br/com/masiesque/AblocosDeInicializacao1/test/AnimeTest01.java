package br.com.masiesque.AblocosDeInicializacao1.test;

import br.com.masiesque.AblocosDeInicializacao1.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball");

        for(int eps: anime.getEp())
            System.out.println(eps+ "");
    }
}
