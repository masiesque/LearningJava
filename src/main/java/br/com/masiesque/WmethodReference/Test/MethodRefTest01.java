package br.com.masiesque.WmethodReference.Test;

import br.com.masiesque.WmethodReference.Domain.Anime;
import br.com.masiesque.WmethodReference.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodRefTest01 {
    public static void main(String[] args) {
        List<Anime>animesList = new ArrayList<>(List.of
                (new Anime("Naruto Shippuden",500),
                        new Anime("One piece", 9000),
                        new Anime("Attack on titan",300)));
//feito com uma subClasse anonima de comparator:
//        Collections.sort(animesList, new Comparator<Anime>(){
//            @Override
//            public int compare(Anime o1, Anime o2) {
//                return o1.getName().compareTo(o2.getName());
//
//
//            }
//        });

       // Collections.sort(animesList,(a1,a2)->a1.getName().compareTo(a2.getName()));//com lambda
       // Collections.sort(animesList, AnimeComparators::compareByName);//por method reference;
        System.out.println(animesList);//já ordenado, ele muda a lista na memoria heap
    }

}
