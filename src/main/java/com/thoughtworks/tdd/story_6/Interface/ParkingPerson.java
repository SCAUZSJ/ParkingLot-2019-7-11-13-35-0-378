package com.thoughtworks.tdd.story_6.Interface;




import com.thoughtworks.tdd.story_6.Car;
import com.thoughtworks.tdd.story_6.ParkingLot;
import com.thoughtworks.tdd.story_6.Ticket;

import java.util.List;

public interface ParkingPerson {

    Ticket parking(Car car);
    Car redeemCar(Ticket ticket);
    ParkingLot chooseParkingLot();
}
