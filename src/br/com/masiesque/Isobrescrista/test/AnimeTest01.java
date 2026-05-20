package br.com.masiesque.Isobrescrista.test;

import br.com.masiesque.Isobrescrista.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime01 = new Anime("JoJo");
        //System.out.println(anime01.getNome());
        //ou
        System.out.println(anime01);//mechemos no metodo toString , da classe pai de todas->Object(todos as classes herdam dessa super classe)
    }
}
