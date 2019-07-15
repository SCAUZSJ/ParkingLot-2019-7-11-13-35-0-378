package com.thoughtworks.tdd.story_5;

import com.thoughtworks.tdd.Enum.FeedBack;
import com.thoughtworks.tdd.story_5.Interface.ParkingPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingBoy implements ParkingPerson {

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
        ParkingLot parkingLot =chooseParkingLot();
        Ticket ticket =null;
        if(parkingLot!=null){
            ticket = parkingLot.park(car);
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

    @Override
    public ParkingLot chooseParkingLot() {
        List<ParkingLot> parkingLots = this.parkingLots.stream().filter((pl)->{
            return pl.getCarList().size()<pl.getCapacity();
        }).collect(Collectors.toList());
        if(parkingLots.size()>0){
            return parkingLots.get(0);
        }
        return null;
    }


    public String getServiceFeedBack() {
        return serviceFeedBack;
    }

    public void setServiceFeedBack(String serviceFeedBack) {
        this.serviceFeedBack = serviceFeedBack;
    }


}
