package br.com.masiesque.Pio.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriteTest02 {

    public static void main(String[] args) {
        File file = new File("teste2.txt");

        try( FileWriter fw = new FileWriter(file))// estou usando o try-with-resources, pq o FileWriter herda closeable;
        {
            fw.write("Aprendendo JAVA 123...\nVirando um javeiro 123\nfeuifhbeuifhbueifuiwfbuifbwieufbeiufiwbfwebfi");
            fw.flush();// usamos ele para que o buffer do sistema operacional realmente mande toda a string para o arquivo, ele dá a ultima varredura;

        }catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}
