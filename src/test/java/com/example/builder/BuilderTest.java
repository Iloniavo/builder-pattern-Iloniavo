package com.example.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    Manual expectedManual(){
        Manual manual =  new Manual();
        manual.setSeats(5);
        manual.setTripComputer(true);
        manual.setGps(true);
        manual.setGps(true);
        manual.setEngine("V8");
        return manual;
    }

    Car expectedCar(){
        Car car = new Car();
        car.setSeats(5);
        car.setEngine("V6");
        car.setTripCompute(true);
        car.setGps(true);
        return car;
    }

    @Test
    void build_SUV_car(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();

        assertEquals(expectedCar(), car);
    }

    @Test
    void manual_from_sport_car(){
        Director director = new Director();
        CarManual carManual = new CarManual();
        director.makeSportsCar(carManual);
        Manual car = carManual.getResult();
        int expectedSeats = 5;

        assertEquals(expectedManual(), car);
    }
}
