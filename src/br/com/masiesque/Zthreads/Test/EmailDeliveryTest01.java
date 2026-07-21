package br.com.masiesque.Zthreads.Test;

import br.com.masiesque.Zthreads.Domain.Members;
import br.com.masiesque.Zthreads.Service.EmailDeliveryService;

public class EmailDeliveryTest01 {

    public static void main(String[] args) {
        Members members = new Members();
        Thread breno = new Thread(new EmailDeliveryService(members), "Breno");
        Thread marcia= new Thread(new EmailDeliveryService(members),"Marcia");

        breno.start();
        marcia.start();



    }
}
