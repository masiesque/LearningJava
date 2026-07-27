package br.com.masiesque.ZZAconcorrencia.Test;

import com.sun.jdi.ThreadReference;

import java.util.concurrent.ArrayBlockingQueue;

public class Desafio01 {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> listaPedidos = new ArrayBlockingQueue<>(3);

        Runnable produtora = ()-> {
            //sobreescrevendo por lambda o metodo run(), para usar no thred dps

            for(int i= 1; i<6; i++)
            {
                try {
                     listaPedidos.put("Hamburguer #"+i);
                    System.out.println("Pedido adicionado -> Hamburguer #"+i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Runnable consumidora = ()->{
            boolean flag  = true;

            while(flag)
            {
                try {
                    String takedOrder = listaPedidos.take();
                    System.out.println(Thread.currentThread().getName()+" Pedido:"+takedOrder);
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };

        Thread p1 = new Thread(produtora,"Atendente-Juliano");
        Thread c1 = new Thread(consumidora, "Chef-Otto");
        Thread c2 = new Thread(consumidora, "Ajudante-Linguine");
        p1.start();
        c1.start();
        c2.start();


    }
}
