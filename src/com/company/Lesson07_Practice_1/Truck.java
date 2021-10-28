package com.company.Lesson07_Practice_1;


public class Truck extends Car {
    // В классе Грузовик создайте поля:
    // количество колес
    private int wheelNum;
    // максимальный вес
    private int maxWeight;

    //    В класс Грузовик сделайте конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.
    public Truck(int w, String m, char c, float s, int wheelNum, int maxWeight) {
        super(w, m, c, s);
        this.wheelNum = wheelNum;
        this.maxWeight = maxWeight;
    }

    //    Также создайте метод newWheels, который устанавливает новое значение в поле «количество колес» и выводит его в консоль.
    public void newWheel(int updatedWheelNum) {
        this.wheelNum = updatedWheelNum;
        System.out.println("Текущее кол-во колес грузовика: " + wheelNum);
    }
}



