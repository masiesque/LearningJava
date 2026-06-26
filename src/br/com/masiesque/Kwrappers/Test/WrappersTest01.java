package br.com.masiesque.Kwrappers.Test;

public class WrappersTest01 {
    public static void main(String[] args) {

        //tipos primitivos
//        byte bytep = 1;
//        short shortp = 1;
//        int intp = 1;
//        long longp = 10L;
//        float floatp =10F;
//        double doublep = 10.0D;
//        char charp = 'P';
//        boolean boolp = false;
//        //tipos primitivos

        //wrappers:
//        Byte bytew = 1;
//        Short shortw = 1;
//        Integer intw = 1;
//        Long longw = 10L;
//        Float floatw =10F;
//        Double doublew = 10.0D;
//        Character charw = 'W';
//        Boolean boolw = false;
        //wrappers


        //podemos transformar tipos primitivos em wrappers e vice-versa:

        //-PRIMITIVO PARA WRAPPER
        int idade = 20;
        Integer idadeWrapper = idade;//nesse caso o java faz o auto-boxing automaitcamente;
        //Integer idadeWrapper = Integer.valueOf(idade); (ESSE SERIA O METODO MANUAL)


        //-WRAPPER PARA PRIMITIVO:
        Long longw = 30L;
        long longp = longw;//java tbm faz automaticamente;
        //int idade = idadeWrapper.intValue(); INTERNAMENTE ACONTECE ISSO.

    }
}
//WRAPPERS nada mais são, doque objetos que encapsulam os tipos primitivos. O java basicamente pensou em tornar  os tipos
// primitivos em objetos, para deixá-los mais dinâmicos, com métodos e funções úteis para o mesmo.
//por padrão o java aconselha usar o máximo possível os tipos primitivos, por gestão de memoria etc.

