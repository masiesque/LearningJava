package br.com.masiesque.Pio.Test;
import java.io.File;
import java.io.IOException;

public class FileTest01 {


    public static void main(String[] args) {
        File file = new File("teste.txt ");

        try{
           boolean isCreated =  file.createNewFile();
           boolean isDeleted = file.delete();

            System.out.println(isCreated);
            System.out.println(isDeleted);

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
