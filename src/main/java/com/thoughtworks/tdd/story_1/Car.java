package com.thoughtworks.tdd.story_1;

public class Car {
    private int carId;

    public Car(){

    }
    public Car(int carId) {
        this.carId = carId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}
