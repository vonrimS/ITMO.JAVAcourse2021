package com.company.Lesson01_ClassWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Hello world");

        final int number = 9;
        System.out.println("Переменная: " + number);

        int small = 300;
        System.out.println("Переменная: " + small);

        float num = 7.99F;
        System.out.println("This is float type: " + num);

        double num_double = 6.7398777001;
        System.out.println("This is double type: " + num_double);

        boolean ready = true;
        System.out.println("This is boolean type: " + ready);

        int a = 6;
        int b = 88;
        int max = a > b ? a : b;

        System.out.println(max);

        /*System.out.println();
        int a = 10, b = 8;
        int whatNum = a == b ? 300 : 100;
        System.out.println(whatNum);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some name:");
        String name = scanner.next();
        System.out.println("Ok, great! Your name is ..." + name);


        //System.out.println(num);
    }
}
