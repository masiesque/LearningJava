package br.com.masiesque.ZZAconcorrencia.Service;

import br.com.masiesque.Zthreads.Domain.Members;

public class EmailDeliveryService implements  Runnable{

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+ " starting to deliver emails...");

        while(members.isOpen()|| members.pendingEmails()>0)
        {
            try {
                String email = members.catchEmails();
                if(email== null) continue;
                System.out.println(threadName+" sending email to "+ email);
                Thread.sleep(2000);
                System.out.println(threadName+ " email sent sucessfully  ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("All emails were sent sucessfully");

    }

}
