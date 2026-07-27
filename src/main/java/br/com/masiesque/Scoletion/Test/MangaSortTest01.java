package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.MangaS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {

        List<MangaS> mangas = new ArrayList<>();
        mangas.add(new MangaS(1L, "Naruto Shipudden", 19.99));
        mangas.add(new MangaS(2L, "One Piece", 24.99));
        mangas.add(new MangaS(8L, "Attack on Titan", 22.50));
        mangas.add(new MangaS(5L, "Jujutsu Kaisen", 19.99));
        mangas.add(new MangaS(3L, "Demon Slayer", 18.90));
        mangas.add(new MangaS(6L, "My Hero Academia", 21.00));
        int i=1;
        System.out.println("Método sem sorting:\n");
        for(MangaS m: mangas)
        {
            System.out.println("Manga "+i+' '+m);
            i++;
        }
        System.out.println("\n===================\nCom Sorting\n");
        Collections.sort(mangas);
        int c= 1;
        for(MangaS m: mangas)
        {

            System.out.println("Manga "+c+' '+m);
            c++;
        }
    }
}
