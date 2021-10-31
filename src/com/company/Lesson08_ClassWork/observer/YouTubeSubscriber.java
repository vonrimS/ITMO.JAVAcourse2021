package com.company.Lesson08_ClassWork.observer;

public class YouTubeSubscriber implements Observer {

    private Observable observable;

    public YouTubeSubscriber(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("New video on channel!");
    }
}
