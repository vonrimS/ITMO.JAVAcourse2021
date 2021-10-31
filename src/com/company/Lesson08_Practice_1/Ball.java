package com.company.Lesson08_Practice_1;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
        setVolume((4 * Math.PI * Math.pow(radius, 3))/3);
    }

    @Override
    public double getVolume() {
        System.out.println("Была создана сфера");
        return super.getVolume();
    }
}
