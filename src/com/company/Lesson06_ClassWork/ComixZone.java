package com.company.Lesson06_ClassWork;

public class ComixZone {
    public static void main(String[] args) {
        Cat cat = new Cat("Mila");
        Cat.Bow bow = cat.new Bow("Red");
        bow.printColor();
        bow.putBow();

        System.out.println();
        Paint.Sketch sketch = new Paint.Sketch(0);

        sketch.drawSketch();

        System.out.println();
        Paint.setLength(10);
        Paint.setWidth(7);
        sketch.drawSketch();
    }
}

class SuperHero {
    class SuperMan {

    }

    class IronMan {

    }

}
