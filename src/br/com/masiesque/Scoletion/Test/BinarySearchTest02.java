package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.MangaS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        List<MangaS> mangas = new ArrayList<>(6);
        mangas.add(new MangaS(1L, "Naruto Shipudden", 19.99));
        mangas.add(new MangaS(2L, "One Piece", 24.99));
        mangas.add(new MangaS(8L, "Attack on Titan", 22.50));
        mangas.add(new MangaS(5L, "Jujutsu Kaisen", 19.99));
        mangas.add(new MangaS(3L, "Demon Slayer", 18.90));
        mangas.add(new MangaS(6L, "My Hero Academia", 21.00));


            Collections.sort(mangas);//comparando por nome em ordem alfabética;
        for(MangaS m: mangas)
            System.out.println(m+";\n");

        MangaS mangaToSeach = new MangaS(3L, "Demon Slayer", 18.90);
        System.out.println("\n=================\n");
        System.out.println(Collections.binarySearch(mangas,mangaToSeach));

    }
}

