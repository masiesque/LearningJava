package br.com.masiesque.Ystreams.Test;

import br.com.masiesque.Ystreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//1.Order LightNovels by title;
//2. Retrieve the first 3  lighNovels with price less than 4;
//IMPORTANTE -> Usando Stream;

public class StreamTest02 {
    private static List<LightNovel> lightList = new ArrayList<>( List.of(
            new LightNovel("ben10",10.99),
            new LightNovel("Naruto", 4.95),
            new LightNovel("Punisher", 2.95),
            new LightNovel("Batman", 1.95),
            new LightNovel("Veja", 1.95),
            new LightNovel("Veja", 1.00),
            new LightNovel("MAD", 20.00)
    ));
    public static void main(String[] args) {

       List<String>titleList =  lightList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(list->list.getPrice()< 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titleList);


    }
}
