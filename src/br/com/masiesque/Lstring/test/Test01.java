package br.com.masiesque.Lstring.test;

import javax.naming.Name;
import java.util.StringJoiner;

public class Test01 {
    public static void main(String[] args) {

        String name1 = "Breno";//instanciando de maneira literal
        String name = "Breno";//instanciando de maneira literal
        System.out.println(name1 == name);

        System.out.println(name1.concat(" Masi")); // name1 += " Masi";
        System.out.println(name1 == name);
            String name2 = new String("Breno");
        System.out.println(name == name2);
        System.out.println("Agora se comparamos o valor que o objeto aponta na POOL");
        System.out.println(name == name2.intern());

    }



}
//No Java ja sabemos que String são objetos vinda da classe String. Elas são objetos imutáveis, ou seja, uma vez que uma
//variável referencia ela na memória heap é criada essa String. Na realidade por padrão temos oq chamamos de String's Pool
//que como o próprio nome já diz, é literalemnte um local na memória onde ficam armazenadas as Strings, quando instanciadas de maneira literal
//Quando instanciamos elas como um objeto(new String()) criamos um objeto na heap, que irá apontar para String Pool;
//IMPORTANTE dizer que quando criamos duas ou mais variaveis de referencia que tem a mesma String sendo referenciada, elas apontam para o mesmo
//objeto na String Pool;

//|--------------------------------------------------------------------------------------------------------------------|
//|(string1 == string2) está comparando se elas apontam/referenciam o mesmo endereço de memória(ou seja o mesmo objeto)|
//|(string1.equals(string2), apenas verifica se os objetos que elas apontam, contem o mesmo valor.                     |
//|--------------------------------------------------------------------------------------------------------------------|

//String VS StringBuilder:
//String é imutável. Já o StringBuilder ele é mutável(funciona por alocação dinâmica, mas vc tem acesso direto por referencia de memória a este obje dentro da heap, por poteiros)
