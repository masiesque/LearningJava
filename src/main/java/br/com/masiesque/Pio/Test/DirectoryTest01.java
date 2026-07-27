package br.com.masiesque.Pio.Test;

import java.io.File;
import java.io.IOException;

public class DirectoryTest01 {

    public static void main(String[] args) {

        File folder = new File("folder");
        boolean isCreatedFolder = folder.mkdir();
        System.out.println("Pasta criada: "+isCreatedFolder);

       // File file = new File("C:\\Users\\Usuário\\IdeaProjects\\aulaJava\\exercioPOO\\exerPOO\\folder\\file.txt");
        //ou
         File file = new File(folder,"file.txt");

        try
        {
            boolean isCreatedFile = file.createNewFile();
            System.out.println("Arquivo Criado: "+isCreatedFile);
        }catch(IOException e)
        {
            e.printStackTrace();
        }

        File folderNew = new File("FolderRenamed");
        boolean isRenamed= folder.renameTo(folderNew);
        System.out.println("Diretório renomeado: "+isRenamed);  
    }
}
