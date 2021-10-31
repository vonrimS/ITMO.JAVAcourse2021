package com.company.Lesson08_Practice_1;

public class Main {
    public static void main(String[] args) {
        Shape p4 = new Pyramid(10, 10,type.SQUARE);
        System.out.println(p4.getVolume());
        System.out.println();
        Shape p6 = new Pyramid(10, 10,type.HEXAGONAL);
        System.out.println(p6.getVolume());
        System.out.println();
        Shape p3 = new Pyramid(10, 10,type.TRIANGLE);
        System.out.println(p3.getVolume());
        System.out.println();
        Shape c1 = new Cylinder(10, 10);
        System.out.println(c1.getVolume());
        System.out.println();
        Shape b1 = new Ball(2);
        System.out.println(b1.getVolume());
        System.out.println();
        Box box1 = new Box(10);
        System.out.println();
        box1.add(p4);
        box1.add(p3);
        box1.add(p3);
        box1.add(p3);
        box1.add(p3);
        box1.add(p3);

    }
}
