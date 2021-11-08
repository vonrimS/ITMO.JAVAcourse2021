package com.company.Lesson12_Practice;

import javax.naming.event.ObjectChangeListener;

public class SayYourName extends Thread {
    private String name;
    private Object lock;

    public SayYourName(String name, Object obj) {
        this.name = name;
        this.lock = obj;
    }

//    public SayYourName(String name) {
//        this.name = name;
//    }


//    public void sayYourName(){
//        synchronized (lock){
//            try{
//                //lock.wait();
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Привет! Меня зовут " + name + ". А как Ваше имя?");
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


//    @Override
//    public void run() {
//        synchronized (lock){
//            System.out.println("My name is " + name + ". What is your name?");
//            try {
//                this.join();
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//       // notify();
//    }
}
