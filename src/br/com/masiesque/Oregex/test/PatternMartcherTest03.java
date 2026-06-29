package br.com.masiesque.Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMartcherTest03 {
    public static void main(String[] args) {


        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        Pattern padrao = Pattern.compile(regex);
        String exam= "12 0x 0XFFABC Ox109 0X1";

        Matcher matcher = padrao.matcher(exam);

        while(matcher.find())
            System.out.println(matcher.start()+" "+matcher.group());

    }
}
