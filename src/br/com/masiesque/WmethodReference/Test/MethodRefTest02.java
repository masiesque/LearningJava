package br.com.masiesque.WmethodReference.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;


//REGRAS:
//vou fazer o primeiro meto-do com lambda ou methodReference
//O segundo será com nested class;
//REGRAS:


//nested class:

//nested class
public class MethodRefTest02 {



    private static class  checkeLister implements BiPredicate<List<String>,String>
    {
        @Override
        public boolean test(List<String> strings, String s) {
            return strings.contains(s);
            //basicamente estou pedindo para o metodo retornar se a minha codição é true or false;
        }
    }

    public static void main(String[] args) {
        List<String> listName = new ArrayList<>(List.of("Breno","Jonas","Naruto"));
         //Function<String, Integer> stringToInteger = s->Integer.parseInt(s);
        // ou
       Function<String, Integer> stringIntegerFunction = Integer::parseInt;//colocamos esse metodo numa variavel;

        Integer num = stringIntegerFunction.apply("45");
        System.out.println(num);

//        boolean listContains = new checkeLister().test(listName,"Naruto");
        System.out.println(new checkeLister().test(listName,"Naruto"));



    }
}
