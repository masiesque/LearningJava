package br.com.masiesque.ZZDjdbc.Service;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.Repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.awt.color.ProfileDataException;

@Log4j2
public class ProducerService {

    public static void save(Producer producer)
    {
        ProducerRepository.save(producer);
    }

    public static void delete (Integer id)
    {
        requiredValidID(id);
        ProducerRepository.delete(id);
    }
    public static void uptade (Producer producer)
    {
        requiredValidID(producer.getId());
        ProducerRepository.uptade(producer);
    }


    private static void requiredValidID(Integer id)
    {
        if(id == null || id<=0)
            throw new IllegalArgumentException("Id has invalid value");
    }

}
