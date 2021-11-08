package com.company.Lesson12_Practice;

public class ThreadsTaskTwo extends Thread {
    private int threadNum;


    public ThreadsTaskTwo() {
    }

    public ThreadsTaskTwo(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        System.out.println("Статус потока " + this.getName() + " внутри метода .run() : " + Thread.currentThread().isAlive());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
