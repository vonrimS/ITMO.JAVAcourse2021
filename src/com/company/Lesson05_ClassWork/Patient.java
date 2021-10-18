package com.company.Lesson05_ClassWork;

public class Patient {
    String name;
    int age;
}

class PClass{
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.name = "Anna";
        p1.age = 22;
        System.out.println( p1.name + " " + p1.age);

        Patient p2 = p1;

        p2.name= "Tom";
        System.out.println(p2.name + " " + p2.age);
        System.out.println( p1.name + " " + p1.age);

        p1.age = 66;
        System.out.println(p2.name + " " + p2.age);
        System.out.println( p1.name + " " + p1.age);

        Patient p3 = null;

    }
}

//public
//protected
//default
//private
