package com.thoughtworks.tdd.story_5;

import com.thoughtworks.tdd.Enum.FeedBack;
import com.thoughtworks.tdd.story_5.Interface.ParkingPerson;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmartParkingBoy extends ParkingBoy implements ParkingPerson {

    public SmartParkingBoy(ParkingLot parkingLot) {
        super(parkingLot);
    }

    public SmartParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public Ticket parking(Car car) {
        if(car.getCarId()==null) return null;
        Ticket ticket = null;
        ParkingLot parkingLot = chooseParkingLot();

        if(parkingLot==null){
            super.setServiceFeedBack(FeedBack.NotEnoughPosition.getMessage());
        }else{
            ticket = parkingLot.park(car);
        }
        return ticket;
    }
    @Override
    public ParkingLot chooseParkingLot() {
        List<ParkingLot> parkingLots = super.getParkingLots();
        List<ParkingLot> parkingLotList = parkingLots.stream().filter((pl)->{
            return pl.getMax()-pl.getCarList().size()>0;
        }).sorted(Comparator.comparing(pl->pl.getMax()-pl.getCarList().size())).collect(Collectors.toList());
        if(parkingLotList.size()>0){
            return parkingLotList.get(parkingLotList.size()-1);
        }
        return null;
    }
}
