package br.com.masiesque.Oregex.test;

import java.util.Scanner;

public class ScannerTest02 {

    public static void main(String[] args) {
        String textos = "Levi Nathan Mikasa Breno true 912 false 100";
        Scanner scanner = new Scanner(textos);
        scanner.useDelimiter(" ");

        while(scanner.hasNext())
        {
            if(scanner.hasNextInt())
            {
                int i = scanner.nextInt();
                System.out.println("int "+ i);
            }
            if(scanner.hasNextBoolean())
            {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean "+ b);
            }else
                System.out.println("String "+ scanner.next());
        }
    }
}
