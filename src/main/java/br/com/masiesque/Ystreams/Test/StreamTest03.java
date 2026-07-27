package br.com.masiesque.Ystreams.Test;

import br.com.masiesque.Ystreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest03 {

    public static void main(String[] args) {
        List<String> words = List.of("Bom","dia","familia");

       String[]arrayString= words.get(0).split("");
        System.out.println(Arrays.toString(arrayString));
        System.out.println("---------------");

        List<String> letters1 = words.stream().map(w -> w.split(""))//stream<String[]>
                .flatMap(Arrays::stream)//Stream<String>
                .collect(Collectors.toList());

        System.out.println(letters1);
    }






}
