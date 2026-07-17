package br.com.masiesque.Ystreams.Test;


import br.com.masiesque.Ystreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1.Order LightNovels by title;
//2. Retrieve the first 3  lighNovels with price less than 4;
public class StreamTest01 {

    private static List<LightNovel> lightList = new ArrayList<>( List.of(
            new LightNovel("ben10",10.99),
            new LightNovel("Naruto", 4.95),
            new LightNovel("Punisher", 2.95),
            new LightNovel("Batman", 1.95),
            new LightNovel("Veja", 1.95),
            new LightNovel("Veja", 1.00),
            new LightNovel("MAD", 20.00)
      ));

    public static void main(String[] args) {

lightList.sort(Comparator.comparing(LightNovel::getTitle));//method Reference, passamos a classe e metodo a ser usado;
        List<String>titleList = new ArrayList<>();

        for(LightNovel l: lightList) {
            if (l.getPrice() < 4)
                titleList.add(l.getTitle());

            if (titleList.size()>= 3)
                break;
        }

        System.out.println(lightList);
        System.out.println("================");
        System.out.println(titleList);

    }
}


/////IMPORTANT NOTES:
////*
//==========================================================================================================================
//        | INTERFACES FUNCIONAIS DO PACOTE java.util.function                                                             |
//        ==================================================================================================================
//        | Interface            | Assinatura      | Méto-do Abstrato    | Parâmetro Entrada | Retorno     | Uso Comum     |
//        ==================================================================================================================
//        | Function<T, R>       | T -> R          | R apply(T t)       | 1 valor (T)       | 1 valor (R) | Transformações |
//        | Predicate<T>         | T -> boolean    | boolean test(T t)  | 1 valor (T)       | boolean     | Filtros/Checks |
//        | Consumer<T>          | T -> void       | void accept(T t)   | 1 valor (T)       | void (nada) | Ações/Prints   |
//        | Supplier<T>          | () -> T         | T get()            | Nenhum            | 1 valor (T) | Fábrica/Criação|
//        ==================================================================================================================
//        | BiFunction<T,U,R>    | (T, U) -> R     | R apply(T t, U u)  | 2 valores (T, U)  | 1 valor (R) | Combinar dados |
//        | BiConsumer<T,U>      | (T, U) -> void  | void accept(T, U)  | 2 valores (T, U)  | void (nada) | Iterar em Maps |
//        | BiPredicate<T,U>     | (T, U) -> bool  | boolean test(T, U) | 2 valores (T, U)  | boolean     | Comparações    |
//        ==================================================================================================================
//        | UnaryOperator<T>     | T -> T          | T apply(T t)       | 1 valor (T)       | 1 valor (T) | Mapear p/ mesmo|
//        | BinaryOperator<T>    | (T, T) -> T     | T apply(T t1, T t2)| 2 valores (T, T)  | 1 valor (T) | Reduções/Soma  |
//        ==================================================================================================================
//        */
/////IMPORTANT NOTES