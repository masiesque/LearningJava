package br.com.masiesque.ZZAconcorrencia.Test;


import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    public void increment()
    {
        this.count++;
        atomicInteger.getAndIncrement();
    }

    public AtomicInteger getAtomicInteger()
    {
        return  this.atomicInteger;
    }
    public int getCounter()
    {
        return this.count;
    }


}
public class AtomicIntegerTest01 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable r = ()-> {
          for(int i=0; i<10000; i++)
          {
              counter.increment();
          }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCounter());
        System.out.println(counter.getAtomicInteger());

    }
}
