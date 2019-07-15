package com.thoughtworks.tdd.story_2;

import com.thoughtworks.tdd.Enum.FeedBack;

public class ParkingBoy {

    private ParkingLot parkingLot;
    private String serviceFeedBack;

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
        if(car.getCarId()==null) return null;
        Ticket ticket = parkingLot.park(car);
        if(ticket == null){
            this.serviceFeedBack = FeedBack.NotEnoughPosition.getMessage();
        }
        return ticket;
    }
    public Car redeemCar(Ticket ticket){

        System.out.println(ticket);
        if(ticket == null) {
            this.serviceFeedBack =FeedBack.PleaseProvide.getMessage();
            return null;
        }
        if(!ticket.getValidity()){
            this.serviceFeedBack =FeedBack.UnrecognizedTicket.getMessage();
            return null;
        }
        Car car = parkingLot.getCar(ticket.getCarId());
        if(car == null){
            this.serviceFeedBack =FeedBack.UnrecognizedTicket.getMessage();
        }
        return car;
    }


    public String getServiceFeedBack() {
        return serviceFeedBack;
    }

    public void setServiceFeedBack(String serviceFeedBack) {
        this.serviceFeedBack = serviceFeedBack;
    }
}
