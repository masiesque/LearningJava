package br.com.masiesque.Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {

//    Regex (Regular Expressions) no Java é uma forma de descrever padrões de texto.
//    Você usa regex para validar, buscar, extrair ou substituir partes de uma String.


    public static void main(String[] args) {
        String regex ="tr";
        String example ="trimestre";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(example);

        while(matcher.find())
            System.out.println(matcher.start()+" -> "+ matcher.group());

    }
}
