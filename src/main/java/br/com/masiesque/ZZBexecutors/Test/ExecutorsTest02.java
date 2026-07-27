package br.com.masiesque.ZZBexecutors.Test;

import java.util.concurrent.*;

public class ExecutorsTest02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService poolThreads = Executors.newFixedThreadPool(3);

        Callable<Double> bancoA = () -> {
            System.out.println("Banco A: Calculando a cotação...");
            Thread.sleep(3000);
            return 5.25;
        };

        Callable<Double> bancoB = () -> {
            System.out.println("Banco B: Calculando a cotação...");
            Thread.sleep(1000);
            return 5.18;
        };

        Callable<Double> bancoC = () -> {
            System.out.println("Banco C: Calculando a cotação...");
            Thread.sleep(2000);
            return 5.20;
        };


        Future<Double> a = poolThreads.submit(bancoA);
        Future<Double> b = poolThreads.submit(bancoB);
        Future<Double> c = poolThreads.submit(bancoC);


        System.out.println("Pegando as promises com o future.get()");

        Double resultA = a.get();
        Double resultB = b.get();
        Double resultC = c.get();
        poolThreads.shutdown();
        //vamos comparar e imprimir o menor valor. Usando a biblioteca math;

        double minValue = Math.min(resultA, Math.min(resultB, resultC));
        System.out.println("\nMenor preço encontrado: U$"+minValue);


    }
}
