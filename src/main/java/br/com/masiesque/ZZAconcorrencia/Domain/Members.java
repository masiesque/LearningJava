package br.com.masiesque.ZZAconcorrencia.Domain;

import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {

    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = new Condition() {
        @Override
        public void await() throws InterruptedException {

        }

        @Override
        public void awaitUninterruptibly() {

        }

        @Override
        public long awaitNanos(long nanosTimeout) throws InterruptedException {
            return 0;
        }

        @Override
        public boolean await(long time, TimeUnit unit) throws InterruptedException {
            return false;
        }

        @Override
        public boolean awaitUntil(Date deadline) throws InterruptedException {
            return false;
        }

        @Override
        public void signal() {

        }

        @Override
        public void signalAll() {

        }
    };
     private boolean open = true;


     public boolean isOpen()
     {
         return open;
     }
     public int pendingEmails()
     {
        lock.lock();
        try
         {
             return emails.size();
         }finally {
            lock.unlock();
        }
     }

     public void addMemberEmail(String email)
     {
            lock.lock();
            try
         {
             String ThreadName = Thread.currentThread().getName();
             System.out.println(ThreadName+ " Adicionou email a fila");
             condition.signalAll();
         }finally {
                lock.unlock();
            }
     }

     public String catchEmails() throws InterruptedException {

         System.out.println(Thread.currentThread().getName()+ "Checking if there are Emails");
            lock.lock();
            try
         {
             while(this.emails.size()==0)
             {
                 if(! open) return null;
                 System.out.println(Thread.currentThread().getName()+ "Não tem email disponível na fila , entrando em modo de espera");
                    condition.await();
             }
             return this.emails.poll();// o metodo poll ele retorna e remove o primeiro elemento da fila;
         }finally {
                lock.unlock();
            }
         // REGRA DE FUNCINAMENTO:
         // essa função serve para verificar e pegar emails existentes.
         //Damos um loocked no objeto com o syncronized e lançamos um looping na lista e colocamos como excessão[if(! open)] para verificar se tem email na lista
         //Caso n tenha emails na lista chamamos um wait até chegar um email e executar nossa função.
         //Dessa maneira fazemos com que o Thread fique travado nesse méto-do até ser executado.
         // REGRA DE FUNCINAMENTO
     }


     public void close()
     {
            lock.lock();
            try {
            System.out.println(Thread.currentThread().getName()+ "Notificando todas as Threads que não estamos não estamos mais pegando emails");
            condition.notifyAll();
        }finally {
                lock.unlock();
            }
     }




}
//sempre que for acessar o objeto que os Threads em questão acessam, uso o Syncronized;
//Relembrar para que que serve o modificador Final;