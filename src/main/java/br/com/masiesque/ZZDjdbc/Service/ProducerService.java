package br.com.masiesque.ZZDjdbc.Service;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.Repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requiredValidID(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requiredValidID(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();

    }

    public static List<Producer> findById(String name) {
        return ProducerRepository.findByName(name);

    }

    public static void showMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    public static void driverMetaData() {

        ProducerRepository.driverMetaData();
    }

    public static void showTypeScrollWorlking() {
        ProducerRepository.showTypeScrollWorlking();
    }

    public static List<Producer> findByNameAndUpdateToUperCase(String name) {

        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndUpdateToLowerCase(String name) {
        return ProducerRepository.findByNameAndUpdateToLowerCase(name);
    }

    public static Producer findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static List<Producer> showAll() {
        return ProducerRepository.showAll();
    }

    public static List<Producer> findByNamePreparedStatment(String name) {
        return ProducerRepository.findByNamePreparedStatment(name);
    }


    //Utils:
    private static void requiredValidID(Integer id) {
        if (id == null || id <= 0)
            throw new IllegalArgumentException("Id has invalid value");
    }
}
