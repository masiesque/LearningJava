package br.com.masiesque.WmethodReference.Service;

import br.com.masiesque.WmethodReference.Domain.Anime;

public class AnimeComparators {

    public static int compareByName(Anime a1, Anime a2)
    {
        return a1.getName().compareTo(a2.getName());
    }
}
