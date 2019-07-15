package com.thoughtworks.tdd.story_4.Interface;




import com.thoughtworks.tdd.story_4.Car;
import com.thoughtworks.tdd.story_4.ParkingLot;
import com.thoughtworks.tdd.story_4.Ticket;

import java.util.List;

public interface ParkingPerson {

    Ticket parking(Car car);
    Car redeemCar(Ticket ticket);
    ParkingLot chooseParkingLot();
}
