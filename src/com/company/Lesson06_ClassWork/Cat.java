package com.company.Lesson06_ClassWork;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private void sayMeow() {
        System.out.println(this.name + " says: \"Meow\"");
    }

    //inner class that depends on Cat class only
    public class Bow {
        String color;

        public Bow(String color) {
            this.color = color;
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has " + this.color + " bow.");
        }

        public void putBow() {
            Cat.this.sayMeow();
            System.out.println("Bow is on");
        }
    }
}
