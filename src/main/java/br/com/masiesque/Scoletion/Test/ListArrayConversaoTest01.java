package br.com.masiesque.Scoletion.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {

    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);

        Integer[] listToArray = listNumbers.toArray(new Integer[0]);
        //Arrays são estruturas nativas/antigas que não reescrevem o méto-do toString() padrão (mostram o endereço de memória).
        // Por isso, usamos a classe utilitária Arrays.toString() para formatar e exibir os elementos visualmente.
        System.out.println("Array->"+Arrays.toString(listToArray));


        //AGORA FAREMOS DE UM ARRAY -> PARA UM LIST;
        System.out.println("\nAGORA FAREMOS DE UM ARRAY -> PARA UM LIST\n");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 2;
        numerosArray[1] = 4;
        numerosArray[2] = 6;
        System.out.println("Array->"+Arrays.toString(numerosArray));





    }
}