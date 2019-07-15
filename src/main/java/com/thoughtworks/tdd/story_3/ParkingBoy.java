package com.thoughtworks.tdd.story_3;

import com.thoughtworks.tdd.Enum.FeedBack;
import java.util.ArrayList;
import java.util.List;

public class ParkingBoy{

    private List<ParkingLot> parkingLots = new ArrayList<>();
    private String serviceFeedBack;

    public ParkingBoy() {

    }
    public ParkingBoy(ParkingLot parkingLot) { this.parkingLots.add(parkingLot);}
    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }



    public Ticket parking(Car car){
        if(car.getCarId()==null) return null;
        Ticket ticket = null;
        for(int i=0;i<parkingLots.size();i++){
            ticket = parkingLots.get(i).park(car);
            if(ticket !=null) break;;
        }
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
        Car car = null;
        for(int i=0;i<parkingLots.size();i++){
            if(ticket.getParkingLotId().equals(parkingLots.get(i).getParkingLotId())){
                car = parkingLots.get(i).getCar(ticket.getCarId());
                break;
            }
        }
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
