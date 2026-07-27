package br.com.masiesque.Qnio.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizaTest01 {

    public static void main(String[] args) {

        Path dir = Paths.get("/home/masiesque");//caminho absoluto
        Path clazz = Paths.get("/home/masiesque/dev/ClasseJava.java");

        //System.out.println(dir.relativize(clazz));
        //ou

        Path toClazz = dir.relativize(clazz);
        System.out.println(toClazz);
    }
}
