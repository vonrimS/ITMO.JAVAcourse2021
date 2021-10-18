package com.company.Lesson05_ClassWork;

public class Vehicle {
    public static void main(String[] args) {
        Car audi = new Car("Tesla", "Model S");
        System.out.println(audi);
    }
}

class Car {
    String brandName;
    String model;
    int modelYear;
    int RAL;

    public Car() {
        this.brandName = "noname";
        this.model = "nomodel";
    }

//    public Car(String brandName, String model) {
//        this.brandName = brandName;
//        this.model = model;
//    }

    public Car(String brandName, String model) {
        this(brandName, model, 2020);
    }

    public Car(String brandName, String model, int modelYear) {
        this.brandName = brandName;
        this.model = model;
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", RAL=" + RAL +
                '}';
    }
}
