package br.com.masiesque.Xoptional.Test;

import java.util.List;
import java.util.Optional;

//O Optional em si é usado para tratar nullPointersExceptions de um jeito mais funcional.Retornando mensagerias
// mais dinamicas ao user.

public class OptionalTest01  {
    public static void main(String[] args) {

        String s = findName("Gugu").orElse("Nome não existente");
        System.out.println(s);


    }
    private static Optional<String> findName(String name)
    {
        List<String> listNomes = List.of("Gugu", "Rodrigo");

        int indexName = listNomes.indexOf(name);

        if(indexName> 0)
        return Optional.of(name);

        return Optional.empty();

    }
}
//Serializable-> Persistencia de dados, por passagem;
