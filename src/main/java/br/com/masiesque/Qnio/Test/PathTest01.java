package br.com.masiesque.Qnio.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {
        //criando os directorios:
        Path subDictoriesPath = Paths.get("folder01/subFolder01/subFolder02");
        if(Files.notExists(subDictoriesPath))
        {
            try{
                Path subDirectorCreated = Files.createDirectories(subDictoriesPath);
                System.out.println("Diretórios criados!\n");

            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }else
            System.out.println("Diretórios já criados!!\n");
        Path FileInDictoriesCreated = Paths.get(subDictoriesPath.toString(),"fileTest01.txt");
        if(Files.notExists(FileInDictoriesCreated))
        {
            try {
                Path fileCreated = Files.createFile(FileInDictoriesCreated);
                System.out.println("Arquivo criado!\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else
            System.out.println("Arquivo já criado!\n");
    }
}
