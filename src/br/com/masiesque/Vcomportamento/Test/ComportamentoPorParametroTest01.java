package br.com.masiesque.Vcomportamento.Test;

import br.com.masiesque.Vcomportamento.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
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


    public static void main(String[] args) {

        List<Car> carByColor = searchCarsByColor (cars,"green");
        System.out.println(carByColor);
    }

    private static List<Car> searchCarsByColor (List<Car> c,String color) {
        List<Car> CarsByID = new ArrayList<>();

        for (Car car : c) {

            if (car.getColor().equals(color))
                CarsByID.add(car);
        }
        return CarsByID;
    }




}
