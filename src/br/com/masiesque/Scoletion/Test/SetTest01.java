package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.MangaS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<MangaS>mangas = new HashSet<>();
        mangas.add(new MangaS(1L, "Naruto Shipudden", 19.99));
        mangas.add(new MangaS(2L, "One Piece", 24.99));
        mangas.add(new MangaS(8L, "Attack on Titan", 22.50));
        mangas.add(new MangaS(5L, "Jujutsu Kaisen", 19.99));
        mangas.add(new MangaS(5L, "Jujutsu Kaisen", 19.99));
        mangas.add(new MangaS(3L, "Demon Slayer", 18.90));
        mangas.add(new MangaS(6L, "My Hero Academia", 21.00));
        mangas.add(new MangaS(6L, "My Hero Academia", 21.00));

        System.out.println(mangas);

    }
}
