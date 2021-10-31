package com.company.Lesson08_ClassWork.observer;

import java.util.ArrayList;

public class YouTubeChannel implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void releaseNewVideo(String video){
        System.out.println("Release new video: " + video);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
