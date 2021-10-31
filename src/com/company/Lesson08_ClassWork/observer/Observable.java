package com.company.Lesson08_ClassWork.observer;



public interface Observable {
    void addObserver(Observer observer);
    void notifyObserver();
}
