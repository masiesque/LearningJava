package br.com.masiesque.ZZBexecutors.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        ExecutorService poolThread = Executors.newFixedThreadPool(3);//criando uma pool com 3 threads;
        //IMPORTANTE lembrar que caso vc não crie uma ThreadPool para passsar nos seus metodos do CompletableFuture
        // a JVM tem uma generica e implementa os seus Threads automaticamente;

        CompletableFuture<Boolean>payment = CompletableFuture.supplyAsync(()->{
            System.out.println("Processando pagamento....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        },poolThread);

        CompletableFuture<Boolean>stock = CompletableFuture.supplyAsync(()->{
            System.out.println("Buscando produto no estoque...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           return true;
        },poolThread);

      CompletableFuture<Void> finalResult = payment.thenCombine(stock,(boolp,bools)->{
         if(boolp && bools)
             System.out.println("Nota Fiscal Gerado com Sucesso!!!");
          return null;
      });

      finalResult.join();
      poolThread.shutdown();



    }
}
