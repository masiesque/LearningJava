package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("12ab", "Iphone");
        Smartphone s2 = s1;


        System.out.println(s1.equals(s2));
    }
}
