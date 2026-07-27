package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.Consumidor;
import br.com.masiesque.Scoletion.Domain.MangaS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor c1 = new Consumidor("Breno");
        Consumidor c2 = new Consumidor("William Suane");


      MangaS manga1 = new MangaS(1L, "Naruto Shipudden", 19.99);
        MangaS manga2 = new MangaS(2L, "One Piece", 24.99);
        MangaS manga3 =new MangaS(8L, "Attack on Titan", 22.50);
        MangaS manga4 =new MangaS(5L, "Jujutsu Kaisen", 19.99);
        MangaS manga5 =new MangaS(3L, "Demon Slayer", 18.90);
        MangaS manga6 =new MangaS(6L, "My Hero Academia", 21.00);

        List<MangaS> ListConsumidor1 = List.of(manga1,manga2,manga3);
        List<MangaS> ListConsumidor2 = List.of(manga4,manga5,manga6);

        Map<Consumidor,List<MangaS>> consumidorMap =new HashMap<>();
        consumidorMap.put(c1,ListConsumidor1);
        consumidorMap.put(c2,ListConsumidor2);

            for( Map.Entry<Consumidor,List<MangaS>> entry : consumidorMap.entrySet())
            {
                System.out.println("Consumidor------ "+entry.getKey().getName());
                for (MangaS s : entry.getValue()) {
                    System.out.println("--- "+ s);
                }

            }




    }
}
