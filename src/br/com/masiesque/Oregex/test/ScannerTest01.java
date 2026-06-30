package br.com.masiesque.Oregex.test;

public class ScannerTest01 {

    public static void main(String[] args) {
        String textos = "Levi1Nathan3Mikasa2Breno";
            String regex = "\\d";
        String[] nomes=  textos.split(regex);

        for(String nome : nomes)
            System.out.println(nome.trim());

        System.out.println("------------\n"+nomes[0].trim());
    }
}
