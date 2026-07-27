package br.com.masiesque.Zthreads.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames
{
    private List<String> names = Collections.synchronizedList(new ArrayList<>());

    public void add(String n)
    {
        names.add(n);

    }

    public synchronized void removeFirst()
    {
        if(names.size()<=0)
            System.out.println("Não é possível remover mais itens. Fila NULA");
        else {
            String remove = names.remove(0);
            System.out.println(remove);
        }
    }


}
public class ThreadSafeTest01 {


    public static void main(String[] args) {
            ThreadSafeNames tn = new ThreadSafeNames();
            tn.add("juninho do grau");
            Runnable r = tn::removeFirst;

            new Thread(r).start();
            new Thread(r).start();

    }
}

    // -Runaable é uma interface Funcional que representa a tarefa ou o bloco de código que vc quer  que uma thread execute primeiro(ela apenas possui o metodo void run());
    //-ThreadSafe é um conceito em que os Threads que são ThreadSafes possuem esse synchronized e não paralelismos, possuindo um tipo de lock que faz a JVM finalizar a
// execução dele primeiro e dps ir para algum outro thread;
    //- O syncronized é necessario para dizer que o metodo segue o modelo Runaable;
