package com.company.Lesson12_Practice;

public class ThreadsTaskOne extends Thread {
    private int threadNum;

    public ThreadsTaskOne(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
                System.out.println("Thread #" + threadNum + " doing work:\t=> " + i);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
