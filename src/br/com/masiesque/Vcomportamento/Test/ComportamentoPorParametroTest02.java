package br.com.masiesque.Vcomportamento.Test;

import br.com.masiesque.Vcomportamento.Domain.Car;
import br.com.masiesque.Vcomportamento.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = new ArrayList<>(List.of(
            new Car("green", 2011),
            new Car("Black", 1997),
            new Car("Silver", 1990),
            new Car("green", 2021),
            new Car("red", 2018),
            new Car("Blue", 2015),
            new Car("white", 2023),
            new Car("Yellow", 2008),
            new Car("grey", 2012),
            new Car("Orange", 2019),
            new Car("blue", 2005),
            new Car("Black", 2022),
            new Car("red", 1999),
            new Car("Gold", 2017)
    ));

    //MAIN
    public static void main(String[] args) {
        List<Car>greenCars  = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });

        //impressões:
        System.out.println(greenCars);
        //impressões
    }
    //MAIN


    private static List<Car> filter(List<Car>car ,CarPredicate cp )
    {
        List<Car>CarsList = new ArrayList<>();

        for (Car car1 : car) {
            if(cp.test(car1))
            CarsList.add(car1);
        }
        return CarsList;

    }
}
