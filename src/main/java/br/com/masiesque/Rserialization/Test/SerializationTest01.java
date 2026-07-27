package br.com.masiesque.Rserialization.Test;

import br.com.masiesque.Rserialization.Domain.Aluno;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Breno",1L,"1234BRENO");
        serializar(aluno);
       deserializar();

    }
    private static void serializar(Aluno aluno)
    {
        Path path = Paths.get("FolderRenamed/arquivo.ser");
        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){

            oss.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializar()
    {
        Path path = Paths.get("FolderRenamed/arquivo.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path)))
        {
           Aluno aluno = (Aluno)ois.readObject();
            System.out.println(aluno);

        }catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

}
