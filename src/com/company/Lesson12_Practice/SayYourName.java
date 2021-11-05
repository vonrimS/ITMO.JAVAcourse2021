package com.company.Lesson12_Practice;

public class SayYourName extends  Thread {
    private String name;
    private Object lock = new Object();

    public SayYourName(String name) {
        this.name = name;
    }

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
        synchronized (lock){
            System.out.println("My name is " + name + ". What is your name?");
            try {
                this.join();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


       // notify();
    }
}
