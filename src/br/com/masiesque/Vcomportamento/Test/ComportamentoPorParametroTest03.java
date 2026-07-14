package br.com.masiesque.Vcomportamento.Test;

import br.com.masiesque.Vcomportamento.Domain.Car;
import br.com.masiesque.Vcomportamento.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
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
    private static List<Integer> integerList = new ArrayList<>(List.of(1,2,12,90));

    //MAIN
    public static void main(String[] args) {
        List<Car>greenCars  = filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });

        List<Integer>filteredInterger = filter(integerList,new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
//                if(integer >=10)
//                    return  true;
//                return false;
                return integer>=10;
            }

        });

        //impressões:
        System.out.println(greenCars);
        System.out.println("----------------");
        System.out.println(filteredInterger);
        //impressões
    }
    //MAIN


    private static <T> List<T> filter(List<T>genericList, Predicate<T> predicate)
    {
        List<T>Filteredlist = new ArrayList<>();

        for( T t : genericList)
        {
            if(predicate.test(t))
                Filteredlist.add(t);
        }
        return Filteredlist;
    }

}
