package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmarPhoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("141214ABBR","Iphone");
        Smartphone s2 = new Smartphone("1111111BR","Iphone");
        Smartphone s3 = new Smartphone("112122121USEUA","Samsung");

        List<Smartphone> cells = new ArrayList<>();
        cells.add(s1);
        cells.add(s2);
        cells.add(s3);
//        cells.clear();
        System.out.println(cells);
        System.out.println("\n==============\n");

        //=============================
        List<String> nomes = new ArrayList<>();
        nomes.add("Breno");
        nomes.add("Pedro");
        nomes.add("Zilma");
        nomes.add("Justa");
        System.out.println(nomes);
        System.out.println("\n------------\n");
        Collections.sort(nomes);
        System.out.println(nomes);
    }
}
