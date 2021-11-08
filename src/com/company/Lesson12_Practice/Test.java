package com.company.Lesson12_Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1
       /* for (int i = 0; i <= 10; i++) {
            ThreadsTaskOne threadTaskOne = new ThreadsTaskOne(i);
            threadTaskOne.run();
        }

        //2
        for (int i = 0; i < 5; i++) {
            ThreadsTaskTwo threadsTaskTwo = new ThreadsTaskTwo(i);
            System.out.println("Статус потока " + threadsTaskTwo.getName() +  " до метода .run() : " + threadsTaskTwo.isAlive());
            threadsTaskTwo.run();
            System.out.println("Статус потока "  + threadsTaskTwo.getName() + " после метода .run() : " + threadsTaskTwo.isAlive());
            System.out.println();
        }

        //3
        for (int i = 0; i < 100; i++) {
            Counter c = new Counter();
            Thread t = new Thread(c);
            System.out.println("Промежуточное значение для потока #" + i + " : " + c.getCount());
            for (int j = 0; j < 1000; j++) {
                t.run();
            }
        }
        System.out.println("=>\tИтоговое значение для счетчика : " + new Counter().getCount());
*/

        //4
//        for (int i = 0; i < 10; i++) {
//            Thread t1 = new Thread(new SayYourName("Mikhail"));
//            Thread t2 = new Thread(new SayYourName("Ekaterina"));
//            Thread t3 = new Thread(new SayYourName("Kseniia"));
//
//            t1.run();
//            t2.run();
//            t3.run();
//
//            Scanner sc = new Scanner(System.in);
//            if (i == 9) {
//                System.out.println("\t Do you REALLY want to keep talking? [Y / N]");
//                String s = sc.nextLine();
//                if (s.equalsIgnoreCase("y")) {
//                    i = 0;
//                }
//            }
//        }

        Object object = new Object();
        Thread t1 = new Thread(new SayYourName("Евлампий", object));
        Thread t2 = new Thread(new SayYourName("Акстинья", object));
        Thread t3 = new Thread(new SayYourName("Игнат", object));

        t1.start();
        t2.start();
        t3.start();
    }
}
