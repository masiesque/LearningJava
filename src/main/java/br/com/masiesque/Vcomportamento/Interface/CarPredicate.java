package br.com.masiesque.Vcomportamento.Interface;

import br.com.masiesque.Vcomportamento.Domain.Car;

public interface CarPredicate {
    boolean test(Car car);
    //LAMBDA:
    //(parametro)-> <expressão>
    //(Car car) -> <car.getColor().equals("green")>
}
