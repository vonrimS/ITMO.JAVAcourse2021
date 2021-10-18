package com.company.Lesson05_ClassWork;

public class InitExample {
    private int field;
    private int[] array;

    //блок инициализации экземляра или нестатическая инициализация
    {
        System.out.println("...before constructor");
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
    }

    public void print() {
        for (int num : array) {
            System.out.printf("%d", num);
        }
    }

    {
        field = 40;
    }
}

class ArrayInit{
    public static void main(String[] args) {
        InitExample initExample = new InitExample();
        initExample.print();
    }
}