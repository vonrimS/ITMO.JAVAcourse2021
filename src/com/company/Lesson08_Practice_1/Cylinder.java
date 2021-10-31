package com.company.Lesson08_Practice_1;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        setVolume(Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public double getVolume() {
        System.out.println("Был создан цилиндр");
        return super.getVolume();
    }
}
