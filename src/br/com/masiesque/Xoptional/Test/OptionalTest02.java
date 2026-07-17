package br.com.masiesque.Xoptional.Test;

import br.com.masiesque.Xoptional.Domain.Hqs;
import br.com.masiesque.Xoptional.Repository.HqRepository;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest02 {
    public static void main(String[] args) {
//        HQrepository repository = new MangaRepository();
//        Optional<Hqs> supermanIsReal = repository.findById(1);
//        System.out.println();

        Optional<Hqs> hqByTitle= HqRepository.findBytTitle("Superman");
               hqByTitle.ifPresent(new Consumer<Hqs>() {
                    @Override
                    public void accept(Hqs hqs) {
                        hqs.setTitle("Superman the brand new day");
                    }
                });

         HqRepository.findById(3)
                         .orElseThrow(IllegalArgumentException::new);//MethodReference;


        Optional<Hqs> deadpoolExists = HqRepository.findBytTitle("Deadpool");
                        deadpoolExists.orElse( new Hqs("Deadpool",4,1542));




        System.out.println(hqByTitle);
        System.out.println(deadpoolExists);



    }
}
