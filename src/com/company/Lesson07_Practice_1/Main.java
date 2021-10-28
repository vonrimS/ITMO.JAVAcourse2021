package com.company.Lesson07_Practice_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1350, "Ford F150", 'c', 140f);
        car.outPut();
        System.out.println();

        Truck truck = new Truck(1500, "Ford F250", 'b', 150f, 4, 1700);
        truck.outPut();
        System.out.println();
        truck.newWheel(6);
    }
}





