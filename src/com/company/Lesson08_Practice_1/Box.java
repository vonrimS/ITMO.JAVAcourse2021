package com.company.Lesson08_Practice_1;

import java.util.ArrayList;

public class Box extends Shape {
    private double a;
    private ArrayList<Shape> addedShapes;

    public Box(double a) {
        this.a = a;
        setVolume(Math.pow(a,3));
        System.out.println("Был создан кубический контейнер с гранью размером " + a +" и общим объемом " + this.getVolume() + ".");
        addedShapes = new ArrayList<>();
    }

    public boolean add(Shape newShape) {
        double newVolume = this.getVolume() - newShape.getVolume();
        if(newVolume > 0 ){
            addedShapes.add(newShape);
            setVolume(newVolume);
            System.out.println("Место под эту фигуру есть. Фигура была успешно добавлена в контейнер. Оставшееся место в контейнере: " + getVolume());

            return true;
        } else{
            System.out.println("!!! Для этой фигуры недостаточно места в контейнере !!! Подберите фигуру меньшим объемом чем " + getVolume());
            return false;
        }
    }
}
