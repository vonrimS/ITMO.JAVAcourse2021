package com.company.Lesson07_Practice_2;

import java.util.ArrayList;

public class Box extends Shape {

    public void Box(double volume) {
        this.setVolume(volume);
    }

    private ArrayList<Shape> addedShapes = new ArrayList<>();

    public boolean add(Shape newShape) {
        double newVolume = this.getVolume() - newShape.getVolume();
        if(newVolume > 0 ){
            addedShapes.add(newShape);
            System.out.println("Место под эту фигуру есть. Фигура была успешно добавлена в контейнер.");
            this.setVolume(newVolume);
            return true;
        } else{
            System.out.println("Для этой фигуры недостаточно места в контейнере.");
            return false;
        }
    }
}
