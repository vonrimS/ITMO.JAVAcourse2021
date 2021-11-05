package com.company.Lesson12_Practice;

public class Counter extends Thread {
    private static int count = 0;

    public void increment() {
        count = count +1;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        this.increment();
        try {
            //Thread.sleep(1000);
        }catch (Exception e){
            e.getMessage();
        }
    }
}

