package com.company.Lesson07_Practice_2;

//перечисление типов пирамид
enum type {
    TRIANGLE, SQUARE, RECTANGLE, PENTAGONAL, HEXAGONAL
}


public class Pyramid extends Shape {
    private double s;
    private double h;
    private type t;

    public Pyramid(double s, double h, type t) {
        this.s = s;
        this.h = h;
        this.t = t;
    }

    @Override
    public double getVolume() {
        switch (t) {
            case TRIANGLE -> System.out.println("Треугольная пирамида"); // формула для рачета V треугльной пирамиды
            case SQUARE -> System.out.println("Квадратная пирамида"); // формула для рачета V квадратной пирамиды
            case RECTANGLE -> System.out.println("Прямоугольная пирамида"); // формула для рачета V прямоугольной пирамиды
            case PENTAGONAL -> System.out.println("Пятигранная пирамида"); // формула для рачета V пятигранной пирамиды
            case HEXAGONAL -> System.out.println("Шестигранная пирамида"); // формула для рачета V шестигранной пирамиды
        }
        return this.getVolume();//заглушка
    }
}

