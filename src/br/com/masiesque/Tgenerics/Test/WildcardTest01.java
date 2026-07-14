package br.com.masiesque.Tgenerics.Test;


abstract class Animal {

    public abstract void consulta();
}
class  Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consulta canina");
    }
}
class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consulta felina");
    }
}



public class WildcardTest01 {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

    }
    private static void printConsulta (Animal[]animals)
    {
        for (Animal an: animals) {
            an.consulta();//nao pode colocar o sout fora da main;
        }

    }
}
