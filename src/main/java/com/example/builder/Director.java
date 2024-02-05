package com.example.builder;

public class Director {
    public void makeSUV(Builder builder){
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("V6");
        builder.setTripComputer(true);
        builder.setGps(true);
    }

    public void makeSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGps(true);
    }
}
