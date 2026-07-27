package br.com.masiesque.ZZBexecutors.Test;

import java.util.concurrent.*;

public class ExecutorsTest01 {

    public static void main(String[] args) {

        ScheduledExecutorService agenda = Executors.newScheduledThreadPool(1);
        ExecutorService processadorRelatorios = Executors.newFixedThreadPool(2);


        agenda.scheduleAtFixedRate(()->{
            System.out.println("[MONITOR]- Servidor rodando normal...");
        },0,1, TimeUnit.SECONDS);

        processadorRelatorios.submit(()->{
            int cont = 1;
            boolean flag =true;

            while(flag)
            {
                if(cont == 5)
                {
                    String name = Thread.currentThread().getName();
                    System.out.println(name+": Relatório #"+cont);
                flag = false;
                }
                else {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + ": Relatório #" + cont);
                    cont++;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            processadorRelatorios.shutdown();

            try {
                if(processadorRelatorios.awaitTermination(10,TimeUnit.SECONDS)){
                    System.out.println("Todos os relatórios foram processados com sucesso!\n");
                    agenda.shutdown();//shutdown() avisa o pool: "Não aceite novas tarefas,
                    // mas termine as que estão na fila"
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


    }
}
//fixedThreadPool é o ExecutorService