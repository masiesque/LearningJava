package br.com.masiesque.WmethodReference.Test;

import br.com.masiesque.WmethodReference.Domain.Anime;
import br.com.masiesque.WmethodReference.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodRefTest03 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animesList = new ArrayList<>(List.of
                (new Anime("Naruto Shippuden",500),
                        new Anime("One piece", 9000),
                        new Anime("Attack on titan",300)));
        animesList.sort(animeComparators::compareByName);
    }
}
