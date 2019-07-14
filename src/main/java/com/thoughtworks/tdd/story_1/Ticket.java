package com.thoughtworks.tdd.story_1;

public class Ticket {
    private int carId;

    public Ticket(){

    }
    public Ticket(int carId) {
        this.carId = carId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}
