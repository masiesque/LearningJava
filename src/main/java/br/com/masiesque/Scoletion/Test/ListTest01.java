package br.com.masiesque.Scoletion.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // o ArrayList no Java é basicmanete uma lista dinâmica, em quem vc pode incrementar e decrementar sem ter que criar outra lista;

        List<String> listaNomes = new ArrayList<>();
            listaNomes.add("Breno");
            listaNomes.add("João");
            listaNomes.add("Pedro");

            for( String indices: listaNomes )
                System.out.println(indices);

        System.out.println("\n------------Usando o for indexado------------\n");
            for(int i = 0; i< listaNomes.size(); i++)
                System.out.println("Nome: "+listaNomes.get(i) );


    }

}

//Não pode passar no castingo do ArrayList, tipos primitivos. Isso pq o ArrayLiist chama internatmente métodos(equal e hashCode)
//Que obviamente só podem ser acessados por objetos, por isso deve-se utilizar wrappers;
