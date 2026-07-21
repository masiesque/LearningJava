package br.com.masiesque.Zthreads.Domain;

public class Account {

    private int balance = 50;

    public int withdrawal(int amount)
    {
        return this.balance =this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}


