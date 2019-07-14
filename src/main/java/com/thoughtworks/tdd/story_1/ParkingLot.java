package com.thoughtworks.tdd.story_1;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<Car> carList;

    public ParkingLot() {
        carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Ticket park(Car car){
        this.carList.add(car);
        return new Ticket(car.getCarId());
    }

    public Car getCar(int carId) {
        for(int i=0;i<carList.size();i++){
            if(carList.get(i).getCarId() == carId){
                Car car = carList.get(i);
                carList.remove(i);
                return car;
            }
        }
        return null;
    }
}
