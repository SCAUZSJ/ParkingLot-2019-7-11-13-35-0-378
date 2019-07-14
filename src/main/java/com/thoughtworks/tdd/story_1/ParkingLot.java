package com.thoughtworks.tdd.story_1;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    private List<Car> carList;
    private int max=10;

    public ParkingLot() {
        carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public ParkingLot(List<Car> carList, int max) {
        this.carList = carList;
        this.max = max;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }


    public Ticket park(Car car){
        if(this.carList.size()>=this.max){
            return null;
        }
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
