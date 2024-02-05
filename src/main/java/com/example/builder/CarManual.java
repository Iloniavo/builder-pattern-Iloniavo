package com.example.builder;

public class CarManual implements Builder{
    private Manual manual;

    public CarManual(){
        this.manual = new Manual();
    }

    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int number) {
        manual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        manual.setGps(gps);
    }

    public Manual getResult(){
        return this.manual;
    }


}
