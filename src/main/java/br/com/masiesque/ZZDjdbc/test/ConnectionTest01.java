package br.com.masiesque.ZZDjdbc.test;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.Service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2

public class ConnectionTest01 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().name("NHK").build();
        Producer producerToUptade = Producer.builder().id(1).name("MADHOUSE").build();
    
//        ProducerService.save(producer1);
//        ProducerService.delete(6);
//        ProducerService.update(producerToUptade);
//        List<Producer> producerList = ProducerService.findAll();
//            log.info("Producer's List: {}",producerList);
//        List<Producer> producerName = ProducerService.findById("Mad");
//        log.info(producerName);

//        ProducerService.showMetaData();
//        ProducerService.driverMetaData();
        ProducerService.showTypeScrollWorlking();
    }
}
