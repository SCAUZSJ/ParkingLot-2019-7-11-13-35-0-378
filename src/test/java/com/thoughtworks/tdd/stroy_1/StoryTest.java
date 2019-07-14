package com.thoughtworks.tdd.stroy_1;

import com.thoughtworks.tdd.story_1.Car;
import com.thoughtworks.tdd.story_1.ParkingBoy;
import com.thoughtworks.tdd.story_1.ParkingLot;
import com.thoughtworks.tdd.story_1.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StoryTest {

    @Test
    public void should_return_ticket_when_park_a_car() {
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Ticket ticket = parkingBoy.parking(car);

        //then
        Assertions.assertNotNull(ticket);
    }

    @Test
    public void should_return_car_when_submit_a_ticket() {
        //given
        Ticket ticket = new Ticket();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Car car = parkingBoy.redeemCar(ticket);

        //then
        Assertions.assertNotNull(car);
    }
    @Test
    public void should_return_carCount_when_park_cars() {
        //given
        Car car1 = new Car();
        Car car2 = new Car();
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        parkingBoy.parking(car1);
        parkingBoy.parking(car2);
        List<Car> carList = parkingLot.getCarList();
        //then
        Assertions.assertEquals(2,carList.size());
    }
    @Test
    public void should_return_correct_car_when_submit_a_ticket() {
        //given
        Car audi = new Car(100);
        Car maserati = new Car(200);
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);

        //when
        Ticket audiTicket=parkingBoy.parking(audi);
        Ticket maseratiTicket = parkingBoy.parking(maserati);
        Car car = parkingBoy.redeemCar(maseratiTicket);

        //then
        Assertions.assertEquals(maserati,car);
    }
}
