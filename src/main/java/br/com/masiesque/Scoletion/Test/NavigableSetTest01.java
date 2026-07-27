package br.com.masiesque.Scoletion.Test;

import br.com.masiesque.Scoletion.Domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());

        Smartphone s = new Smartphone("12343A","iPhone");

        boolean flagAdd = set.add(s);

        if(flagAdd == true)
            System.out.println("Deu bom");
        else
            System.out.println("Deu ruim");
    }
}
//METODOS QUE TEM NO SET:
//floor <=
//lower <
//higher >
//ceiling >=
//METODOS QUE TEM NO SET/


/**
 * ===============================================================================================
 *                       RESUMO DO JAVA COLLECTIONS FRAMEWORK & ESTRUTURAS
 * ===============================================================================================
 *
 * CONCEPT        | TYPE       | ESSENCE                                 | KEY CHARACTERISTIC
 * --------------+------------+-----------------------------------------+---------------------------------
 * Set            | Interface  | Coleção de elementos únicos             | Não aceita duplicatas.
 * ├── HashSet    | Class      | Implementação rápida de Set             | Sem ordem garantida.
 * ├── LinkedSet  | Class      | Implementação ordenada de Set           | Mantém a ordem de inserção.
 * └── TreeSet    | Class      | Implementação auto-ordenada de Set      | Elementos ordenados (Tree/Árvore).
 * --------------+------------+-----------------------------------------+---------------------------------
 * Map            | Interface  | Dicionário de Pares (Chave -> Valor)    | Chaves são únicas; Valores não.
 * --------------+------------+-----------------------------------------+---------------------------------
 * Map.Entry      | Interface  | Uma única linha (par) dentro de um Map  | Possui os métodos getKey() e getValue().
 * --------------+------------+-----------------------------------------+---------------------------------
 * Comparable     | Interface  | Comparação interna ("Eu com o Outro")   | Méto-do compareTo(o). Ordem natural do objeto.
 * --------------+------------+-----------------------------------------+---------------------------------
 * Comparator     | Interface  | Comparação externa ("Juiz de fora")     | Méto-do compare(o1, o2). Estratégia customizada.
 * ===============================================================================================
 *
 *  DICA DE SINTAXE:
 *  - Para o TreeSet ordenar objetos customizados, passe o Comparator no construtor:
 *    Set<Objeto> set = new TreeSet<>(new MeuComparatorX());
 *
 *  - Para iterar chaves e valores de um Map eficientemente de uma vez só:
 *    for (Map.Entry<K, V> linha : meuMap.entrySet()) { ... }
 * ===============================================================================================
 */