package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.MangaS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<MangaS> mangas = new LinkedList<>();
        mangas.add(new MangaS(1L, "Naruto Shipudden", 19.99,0));
        mangas.add(new MangaS(2L, "One Piece", 24.99,12));
        mangas.add(new MangaS(8L, "Attack on Titan", 22.50,0));
        mangas.add(new MangaS(5L, "Jujutsu Kaisen", 19.99,3));
        mangas.add(new MangaS(3L, "Demon Slayer", 18.90,432));
        mangas.add(new MangaS(6L, "My Hero Academia", 21.00,0));

//       Iterator<MangaS> mangasIterator= mangas.iterator();
//       while(mangasIterator.hasNext())
//       {
//           MangaS nextValue = mangasIterator.next();
//
//           if(nextValue.getQuant() == 0){
//               // O méto-do remove() do Iterator NÃO recebe parâmetros (chamar com argumento causará erro).
//               // Ele não precisa de argumentos porque já lembra internamente qual foi o último elemento
//               // retornado pelo méto-do next(). Assim, ele sabe exatamente quem deve apagar.
//
//               mangasIterator.remove();
//           }
//       }
       //Ou podemos usar um pouco de programação funcional com o .removeIf:

        mangas.removeIf(manga -> manga.getQuant() == 0);
        /// resumimos aquele codigo inteiro em 1 linha com o .removeIf

        System.out.println(mangas);

    }

    //NÃO FAZER REMOÇÕES COM O FOR-EACH//

    //Em termos de linguagem C o .hasNext() é basicamente-> o elemente aponta para algo que nao seja null.Retornado um valor booleano;
    //já o next ele retorna o próximo valor da nossa lista encadeada;

}
