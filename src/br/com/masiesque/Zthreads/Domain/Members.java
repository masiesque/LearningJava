package br.com.masiesque.Zthreads.Domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {

     private final Queue<String> emails = new ArrayBlockingQueue<>();
     private boolean open = true;


     public boolean isOpen()
     {
         return open;
     }
     public int pendingEmails()
     {
         synchronized (this.emails)/// sincronisamos a queue emails, para que apenas um thread por vez acesse esse objeto
         {
             return emails.size();
         }
     }

     public void addMemberEmail(String email)
     {
         synchronized (this.emails)
         {
             String ThreadName = Thread.currentThread().getName();
             System.out.println(ThreadName+ " Adicionou email a fila");
             this.emails.add(email);
             this.emails.notifyAll();
         }
     }

     public String catchEmails() throws InterruptedException {

         System.out.println(Thread.currentThread().getName()+ "Checking if there are Emails");
         synchronized (this.emails)
         {
             while(this.emails.size()==0)
             {
                 if(! open) return null;
                 System.out.println(Thread.currentThread().getName()+ "Não tem email disponível na fila , entrando em modo de espera");
                 this.emails.wait();
             }
             return this.emails.poll();// o metodo poll ele retorna e remove o primeiro elemento da fila;
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
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName()+ "Notificando todas as Threads que não estamos não estamos mais pegando emails");
            this.emails.notifyAll();
        }
     }




}
//sempre que for acessar o objeto que os Threads em questão acessam, uso o Syncronized;
//Relembrar para que que serve o modificador Final;