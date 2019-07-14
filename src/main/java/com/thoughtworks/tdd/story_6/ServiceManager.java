package com.thoughtworks.tdd.story_6;

import java.util.ArrayList;
import java.util.List;

public class ServiceManager extends ParkingBoy {

    private List<ParkingBoy> parkingBoys = new ArrayList<>();

    public ServiceManager(List<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public ServiceManager(ParkingLot parkingLot, List<ParkingBoy> parkingBoys) {
        super(parkingLot);
        this.parkingBoys = parkingBoys;
    }

    public ServiceManager(List<ParkingLot> parkingLots, List<ParkingBoy> parkingBoys) {
        super(parkingLots);
        this.parkingBoys = parkingBoys;
    }

    public void addParkingBoy(ParkingBoy parkingBoy){
        this.parkingBoys.add(parkingBoy);
    }

    //overload
    public Ticket parking(ParkingBoy parkingBoy,Car car) {
        if(parkingBoy!=null) {
            Ticket ticket = parkingBoy.parking(car);
            if(ticket == null){
                super.setErrorMsg(parkingBoy.getErrorMsg());
            }
        }
        return super.parking(car);
    }
    //overload
    public Car redeemCar(ParkingBoy parkingBoy,Ticket ticket) {
        if(parkingBoy!=null){
            Car car = parkingBoy.redeemCar(ticket);
            if(car == null){
                super.setErrorMsg(parkingBoy.getErrorMsg());
            }
        }
        return super.redeemCar(ticket);
    }
}
