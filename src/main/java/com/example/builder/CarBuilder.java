package com.example.builder;

public class CarBuilder implements Builder{
    public Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int seatsNumber) {
        car.setSeats(seatsNumber);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.setTripCompute(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        car.setGps(gps);
    }

    public Car getResult(){
        return this.car;
    }
}
