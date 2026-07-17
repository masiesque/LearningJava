package br.com.masiesque.Xoptional.Repository;

import br.com.masiesque.Xoptional.Domain.Hqs;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class HqRepository {

    public static List<Hqs> hqs = List.of(
            new Hqs("Superman",1,560),
            new Hqs("Batman arkam knight", 2,1000),
            new Hqs("The Amazing Spider-man",3,5100));


   public static Optional<Hqs> findById(Integer idUser)
   {
        return findBy(new Predicate<Hqs>(){
            @Override
            public boolean test(Hqs hqs) {
                return idUser.equals(hqs.getId());
            }
        });
   }

   public static Optional<Hqs> findBytTitle (String titleUser)
   {
       return findBy(new Predicate<Hqs>() {
           @Override
           public boolean test(Hqs hqs) {
               return titleUser.equals(hqs.getTitle());
           }
       });

   }

   //fazendo com lambda:
    public static Optional<Hqs> findByChap(Integer c)
    {
        return findBy(x->c.equals(x.getChapters()));
    }
    //fazendo com lambda:





    private static Optional<Hqs> findBy(Predicate<Hqs>predicateHq)
    {
        Hqs found = null;
        for (Hqs hq : hqs) {
            if(predicateHq.test(hq))
                found = hq;
        }
        return Optional.ofNullable( found);

    }
}
