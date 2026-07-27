package br.com.masiesque.Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {



    public static void main(String[] args) {
        //String example ="trimestre";
        String example02 = "h34rhu3125647894 15@73dfws48";

        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(example02);

        while(matcher.find())
            System.out.println(matcher.start()+" -> "+ matcher.group());

    }
}


//    Regex (Regular Expressions) no Java é uma forma de descrever padrões de texto.
//    Você usa regex para validar, buscar, extrair ou substituir partes de uma String.

//        ╔════════════╦════════════════════════════════════╦══════════════════════════════╗
//        ║ REGEX      ║ SIGNIFICADO                        ║ EXEMPLO                      ║
//        ╠════════════╬════════════════════════════════════╬══════════════════════════════╣
//        ║ .          ║ Qualquer caractere                 ║ a.c → abc, a1c, a-c          ║
//        ║ \d         ║ Um dígito (0-9)                    ║ 5                            ║
//        ║ \D         ║ Qualquer coisa que NÃO seja dígito ║ A, @, espaço                 ║
//        ║ \w         ║ Letra, número ou _                 ║ abc123_                      ║
//        ║ \W         ║ Qualquer coisa que NÃO seja \w     ║ @, #, %, espaço              ║
//        ║ \s         ║ Espaço em branco                   ║ " ", \t, \n                  ║
//        ║ \S         ║ Qualquer coisa que NÃO seja espaço ║ A, 5, @                      ║
//        ║ [abc]      ║ a OU b OU c                        ║ b                            ║
//        ║ [^abc]     ║ Qualquer caractere EXCETO a,b,c    ║ x                            ║
//        ║ [a-z]      ║ Letras minúsculas                  ║ g                            ║
//        ║ [A-Z]      ║ Letras maiúsculas                  ║ M                            ║
//        ║ [0-9]      ║ Dígitos de 0 a 9                   ║ 8                            ║
//        ║ [A-Za-z]   ║ Qualquer letra                     ║ B, z                         ║
//        ╚════════════╩════════════════════════════════════╩══════════════════════════════╝
//
//
//        ══════════════════════════════════════════════════════════════════════════════════
//
//        ╔════════════╦════════════════════════════════════╦══════════════════════════════╗
//        ║ QUANTIFIC. ║ SIGNIFICADO                        ║ EXEMPLO                      ║
//        ╠════════════╬════════════════════════════════════╬══════════════════════════════╣
//        ║ +          ║ Um ou mais                         ║ \d+ → 1, 25, 999             ║
//        ║ *          ║ Zero ou mais                       ║ \d* → "", 7, 123             ║
//        ║ ?          ║ Zero ou um (opcional)              ║ abc? → ab ou abc             ║
//        ║ {n}        ║ Exatamente n vezes                 ║ \d{4} → 1234                 ║
//        ║ {n,m}      ║ Entre n e m vezes                  ║ \d{2,4} → 12,123,1234        ║
//        ║ {n,}       ║ No mínimo n vezes                  ║ \d{3,} → 123,12345           ║
//        ╚════════════╩════════════════════════════════════╩══════════════════════════════╝
//
//
//        ══════════════════════════════════════════════════════════════════════════════════
//
//        ╔════════════╦════════════════════════════════════╦══════════════════════════════╗
//        ║ ÂNCORAS    ║ SIGNIFICADO                        ║ EXEMPLO                      ║
//        ╠════════════╬════════════════════════════════════╬══════════════════════════════╣
//        ║ ^          ║ Início da String                   ║ ^Java                        ║
//        ║ $          ║ Fim da String                      ║ Java$                        ║
//        ╚════════════╩════════════════════════════════════╩══════════════════════════════╝
//
//
//        ══════════════════════════════════════════════════════════════════════════════════
//
//        EXEMPLOS ÚTEIS
//
//        • Apenas números:
//                \d+
//
//                • Exatamente 11 números (CPF sem máscara):
//                \d{11}
//
//        • CEP (12345-678):
//                \d{5}-\d{3}
//
//        • Telefone ((19)98765-4321):
//                \(\d{2}\)\d{5}-\d{4}
//
//        • Apenas letras:
//                [A-Za-z]+
//
//                • Letras e números:
//                [A-Za-z0-9]+
//
//                • Um e-mail simples:
//                [A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}
//
//
//        OBSERVAÇÃO IMPORTANTE (JAVA)
//
//                Na regex, um dígito é escrito como:
//                \d
//
//        Mas dentro de uma String Java, você precisa escrever:
//                "\\d"
//
//        Porque '\' é um caractere de escape nas Strings do Java.