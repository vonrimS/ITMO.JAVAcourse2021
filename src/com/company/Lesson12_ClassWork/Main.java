package com.company.Lesson12_ClassWork;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {

            MultithreadThing myThing = new MultithreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            myThread.isAlive();
            //myThing.start();
        }
       // throw new RuntimeException();

    }
}
