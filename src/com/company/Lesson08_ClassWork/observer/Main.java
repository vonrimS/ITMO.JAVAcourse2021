package com.company.Lesson08_ClassWork.observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        YouTubeSubscriber subscriberA = new YouTubeSubscriber(youTubeChannel);
        YouTubeSubscriber subscriberB = new YouTubeSubscriber(youTubeChannel);
        YouTubeSubscriber subscriberC = new YouTubeSubscriber(youTubeChannel);
        youTubeChannel.addObserver(subscriberA);
        youTubeChannel.addObserver(subscriberB);
        youTubeChannel.addObserver(subscriberC);
        youTubeChannel.releaseNewVideo("Design Patterns : Factory Method");
        youTubeChannel.releaseNewVideo("Design Patterns : Proxy");
        youTubeChannel.releaseNewVideo("Design Patterns : Visitor");

    }
}
