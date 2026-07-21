package br.com.masiesque.Zthreads.Test;

import br.com.masiesque.Zthreads.Domain.Account;

public class ThreadAccountTest01 implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {

        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01,"conta1");
        Thread t2 = new Thread(threadAccountTest01,"conta2");


    }

    private synchronized void withdrawal(int amount)
    {
        if(account.getBalance()>= amount) {
            System.out.println(Thread.currentThread().getName()+" WITHDRAWLING!");
            account.withdrawal(amount);
            System.out.println(Thread.currentThread().getName()+" completou o saque, valor atual na conta corrente-> "+account.getBalance());
        }else
            System.out.println("Sem dinheiro para"+ Thread.currentThread().getName()+ "efetuar o saque"+ account.getBalance());
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
        withdrawal(10);
        if(account.getBalance() < 0)
            System.out.println("FODEU");
        }
    }
}
