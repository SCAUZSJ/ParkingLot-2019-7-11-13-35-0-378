package com.thoughtworks.tdd.story_5.Interface;




import com.thoughtworks.tdd.story_5.Car;
import com.thoughtworks.tdd.story_5.ParkingLot;
import com.thoughtworks.tdd.story_5.Ticket;

import java.util.List;

public interface ParkingPerson {

    Ticket parking(Car car);
    Car redeemCar(Ticket ticket);
    ParkingLot chooseParkingLot();
}
