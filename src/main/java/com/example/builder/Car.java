package com.example.builder;

import java.util.Objects;

public class Car {
    private String type;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats && tripComputer == car.tripComputer && gps == car.gps && Objects.equals(type, car.type) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, tripComputer, gps);
    }

    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripCompute() {
        return tripComputer;
    }

    public void setTripCompute(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
