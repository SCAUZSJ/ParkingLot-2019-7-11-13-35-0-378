package com.thoughtworks.tdd.story_1;

public class Ticket {
    private int carId;
    private boolean validity;//true 为 有效，false 为无效（已使用）

    public Ticket(){
        this.validity = true;
    }
    public Ticket(int carId) {
        this.carId = carId;
        this.validity = true;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public boolean getValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        validity = validity;
    }
}
