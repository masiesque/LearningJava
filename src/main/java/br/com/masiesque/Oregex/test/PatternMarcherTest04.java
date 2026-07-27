package br.com.masiesque.Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMarcherTest04 {
//testando validação de emails, por meio do regex:

    public static void main(String[] args) {

        String emailEx = "LUFFY@hotmail.com, 123LebronJamess@gmail.com.br, *!2PernaAlongadaCC@gmail.com, sakura@mail";
   String regex = "([a-zA-Z0-9._%+-])+@(gmail|hotmail|mail)(\\.([a-zA-Z])+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailEx);

        while (matcher.find())
            System.out.println(matcher.start()+" -> "+matcher.group());
    }
}
