package com.company.Lesson06_ClassWork;

public class Paint {

    private String name;
    private static double length;

    public static double getLength() {
        return length;
    }

    public static void setLength(double length) {
        Paint.length = length;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Paint.width = width;
    }

    private static double width;


    private static void drawBear() {
        System.out.println("Bear was drawn in a sketch!");
    }

    //inner class
    public static class Sketch {
        private int id;

        public Sketch(int id) {
            this.id = id;
        }

        public void drawSketch() {
            drawForest();
            drawBear();
        }

        private void drawForest() {
            if (Paint.length > 5 && Paint.width > 3) {
                System.out.println("Big forest, a kind of woodland");
            } else {
                System.out.println("It's a kind of tiny forest, like a park.");
            }

        }


    }

}
