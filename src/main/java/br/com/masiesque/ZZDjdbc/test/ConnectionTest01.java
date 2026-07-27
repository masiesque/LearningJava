package br.com.masiesque.ZZDjdbc.test;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.Repository.ProducerRepository;
import br.com.masiesque.ZZDjdbc.Service.ProducerService;
import br.com.masiesque.ZZDjdbc.conn.ConnectionFactory;

public class ConnectionTest01 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().name("NHK").build();
        Producer producerToUptade = Producer.builder().id(1).name("MADHOUSE").build();
    
//        ProducerService.save(producer1);
//        ProducerService.delete(6);
        ProducerService.uptade(producerToUptade);
        

    }
}
