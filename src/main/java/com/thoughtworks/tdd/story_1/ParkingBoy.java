package com.thoughtworks.tdd.story_1;

public class ParkingBoy {

    ParkingLot parkingLot;

    public ParkingBoy() {

    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket parking(Car car){
        return parkingLot.park(car);
    }


}
