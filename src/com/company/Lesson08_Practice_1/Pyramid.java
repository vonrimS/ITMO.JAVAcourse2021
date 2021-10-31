package com.company.Lesson08_Practice_1;

//  перечисление типов пирамид
enum type {
    TRIANGLE, SQUARE, HEXAGONAL
}

public class Pyramid extends Shape {
    private double s;
    private double h;
    private type t;

    //конструктор класса и setter объема фигуры в зависимости от типа пирамиды
    public Pyramid(double s, double h, type t) {
        this.s = s;
        this.h = h;
        this.t = t;

        switch (t) {
            case TRIANGLE -> {
                System.out.println("Была создана пирамида с треугольным основанием");
                setVolume((Math.sqrt(3) * s * s * h) / 12);
                break;
            }
            case SQUARE -> {
                System.out.println("Была создана пирамида с квадратным основанием");
                setVolume((s * s * h) / 3);
                break;
            }
            case HEXAGONAL -> {
                System.out.println("Была создана пирамида с шестигранным основанием");
                setVolume(((3 * Math.sqrt(3)) * s * s * h) / 6);
                break;
            }
            default -> {
                System.out.println("...неизвестный тип пирамиды. Объем не известен.");
                break;
            }
        }




    }
}

