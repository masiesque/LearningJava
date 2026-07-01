package br.com.masiesque.Pio.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertest03 {

    public static void main(String[] args) {
        File file = new File("teste2.txt");
        try (FileReader fr = new FileReader(file)){


            //fr.read(in);o read vai chamar o array "in" e colocar tudo que ele ler dentro do array;
//          char[] in = new char[30];
//            fr.read(in);
//
//            for(char c : in)
//                System.out.print(c);


          int i;
          while((i=fr.read())!= -1)
              System.out.print((char)i);
                //O metodo read, é auto-incrementado por isso não preciso de algo que fique reinterando ele
        }catch( IOException r)
        {
            r.printStackTrace();
        }

    }
}
