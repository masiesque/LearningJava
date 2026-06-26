package br.com.masiesque.Mexception.Exception.teste;

import br.com.masiesque.Mexception.Exception.domain.Leitor1;
import br.com.masiesque.Mexception.Exception.domain.Leitor2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;

public class TryWithResourcesTest03 {


    public static void lerArquivo()
    {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e)
        {
        //            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        lerArquivo();
    }
}
