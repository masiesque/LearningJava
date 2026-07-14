package br.com.masiesque.Scoletion.Test;

import java.util.Map;
import java.util.TreeMap;


public class NavigableMapTest01 {

    public static void main(String[] args) {
        java.util.NavigableMap<String,String> nm = new TreeMap<>();
        nm.put("A", "Letra A");
        nm.put("B", "Letra B");
        nm.put("C", "Letra C");
        nm.put("E", "Letra E");
        nm.put("D", "Letra D");

        for(Map.Entry<String,String> entry :nm.entrySet())
                {
                    System.out.println(entry.getKey()+": "+entry.getValue());
                }
    }
}
