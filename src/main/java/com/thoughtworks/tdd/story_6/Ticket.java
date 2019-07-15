package com.thoughtworks.tdd.story_6;

public class Ticket {
    private Integer carId;
    private Integer parkingLotId;
    private boolean validity;//true 为 有效，false 为无效（已使用）
    private Integer operatorId;

    public Ticket(){
        this.validity = true;
    }
    public Ticket(Integer carId) {
        this.carId = carId;
        this.validity = true;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public boolean getValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public Integer getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Integer parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }
}
