package br.com.masiesque.Mexception.Exception.teste;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        createAnFile();


    }


    private static void createAnFile()
    {
        File file = new File("file\\test.txt");
        try {
           boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado: "+isCreate);

        }catch (IOException ex)
        {
            ex.printStackTrace();
        }


    }

}
