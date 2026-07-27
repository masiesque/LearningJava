package br.com.masiesque.Scoletion.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numbers  = new ArrayList<>();

        numbers.add(1);
        numbers.add(0);
        numbers.add(9);
        numbers.add(8);
        numbers.add(2);

        Collections.sort(numbers);
        //(-(ponto de inserção)-1)
        //index 0,1,2,3,4
        //value 0,1,2,8,9

        System.out.println(Collections.binarySearch(numbers,2));// vc coloca a lista já ordenada para ser buscada e a key é o valor que vc quer buscar na lista;
    }
}

