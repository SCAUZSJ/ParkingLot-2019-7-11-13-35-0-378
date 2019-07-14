package com.thoughtworks.tdd.stroy_1;

import com.thoughtworks.tdd.story_1.Car;
import com.thoughtworks.tdd.story_1.ParkingBoy;
import com.thoughtworks.tdd.story_1.ParkingLot;
import com.thoughtworks.tdd.story_1.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
