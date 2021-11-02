package com.company.Lesson08_Practice_2.Task_7_4;

public class Test {
    public static void main(String[] args) {
        Parking parking = new Parking();
        //parking.getAllPlaces();
        //parking.listAllPlaces();
        parking.getParkingPlace(3, "A561XT198");
        //parking.listAllPlaces();
        //parking.getParkingPlace(1, "A561XT198");
        parking.getAllPlaces();
        parking.actionQuery();
    }
}
