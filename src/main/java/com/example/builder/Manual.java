package com.example.builder;


import java.util.Objects;

public class Manual {
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manual manual = (Manual) o;
        return seats == manual.seats && tripComputer == manual.tripComputer && gps == manual.gps && Objects.equals(type, manual.type) && Objects.equals(engine, manual.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, tripComputer, gps);
    }

    @Override
    public String toString() {
        return "Manual{" +
                "type='" + type + '\'' +
                ", seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isTripCompute() {
        return tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    private String type;
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;
}
