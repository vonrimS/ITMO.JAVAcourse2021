package com.company.Lesson03_Practice;

import org.w3c.dom.ls.LSOutput;

import java.awt.font.GraphicAttribute;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1.
        // Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
        // Если он отсортирован по возрастанию то выводится “OK”,
        // если нет, то будет выводиться текст “Please, try again”

        /*
        int[] arrayNOK = {0, 1, 10, 10, 4, 5};
        System.out.println(Arrays.toString(arrayNOK));
        System.out.println(isSortedAsc(arrayNOK));

        //arrayOK = SortAsc(arrayNOK);

        int[] arrayOK = {0, 1, 2, 3, 40, 5};
        System.out.println(Arrays.toString(arrayOK));
        System.out.println(isSortedAsc(arrayOK));

        System.out.println("--------------------");
         */

        //2.
        // Напишите программу, которая считывает с клавиатуры длину массива
        // (например, пользователь вводит цифру 4),
        // затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
        // Пример вывода:
        //        Array length: 4
        //        Numbers of array:
        //        5
        //        6
        //        7
        //        2
        //        Result: [5, 6, 7, 2]

        /*
        System.out.println(createdArrayWithStepComments());
        System.out.println("--------------------");
         */

        //3.
        // Напишите метод, который меняет местами
        // первый и последний элемент массива.
        // Пример вывода:
        //        Array 1: [5, 6, 7, 2]
        //        Array 2: [2, 6, 7, 5]



        /*

        int[] array3 = {5, 6, 7, 2, 8, 66};
        int[] array31 = Arrays.copyOf(array3, array3.length);
        //swapFirstAndLastOne(array3);
        System.out.println("Before selement swapping: ");
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array31));
        System.out.println("After elements swapping: ");
        array31 = swapFirstAndLastOne(array31);
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array31));

        System.out.println("--------------------");
         */


        //4.
        // Дан массив чисел. Найдите первое уникальное в этом массиве число.
        // Например, для массива [1, 2, 3, 1, 2, 4] это число 3.


        /*
        int[] array4 = {111, 2, 3, 3, 3, 888, 1, 2, 2, 2, 4};
        firstUniqueOne(array4);

        System.out.println("--------------------");
         */


        //5.
        // Вычислить N-е число Фибоначчи.
        //
        // !!! поменял на Трибоначи !!!
        //
        // Не использовать рекурсию и массивы, только циклы.

        /*

        System.out.println("Программа вычисляет N-e число Фибоначчи");
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Какое число нужно посчитать?");
        tribonacciNum(scanner5.nextInt());

        System.out.println("--------------------");

        */


        //6.
        // Заполните массив случайными числами и отсортируйте его.
        // Используйте сортировку слиянием.

        /*

        int[] array = createAndFillArrayWithRandom();
        System.out.println(Arrays.toString(array));
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------");

         */


    }

    //к заданию 1
    public static String isSortedAsc(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                flag = true;
            } else if (array[i + 1] < array[i]) {
                flag = false;
                return "Please, try again";
            }
        }
        return "OK";
    }

    //к заданию 2
    public static String createdArrayWithStepComments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива:  ");
        int[] array2 = new int[scanner.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Введите значение элемента %d:  ", i + 1);
            array2[i] = scanner.nextInt();
        }
        String result = "Result: " + Arrays.toString(array2);
        return result;
    }

    //к заданию 3
    public static int[] swapFirstAndLastOne(int[] array3) {
        int temp = array3[0];
        array3[0] = array3[array3.length - 1];
        array3[array3.length - 1] = temp;
        return array3;
    }

    //к заданию 4
    public static void firstUniqueOne(int[] array4) {
        for (int i = 0; i < array4.length; i++) {
            int count = 1;
            int point = array4[i];
            for (int j = i + 1; j < array4.length; j++) {
                if (point == array4[j]) {
                    array4[i] = array4[j] = -1;
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("We got it! The member index is " + i + " and the value is " + array4[i]);
                break;
            } else {
                System.out.println("...No unique member ='(");
            }
        }
    }

    // к заданию 5
    public static int tribonacciNum(int input) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 1;
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            if (i == 0 || i == 1) {
                sum = 0;
                System.out.println("=> " + sum);
            } else if (i == 2) {
                sum = 1;
                System.out.println("=> " + sum);
            } else {
                num1 = num2;
                num2 = num3;
                num3 = sum;
                sum = num1 + num2 + num3;
                System.out.println("=> " + sum);
            }
        }
        System.out.println("Трибоначчи N - " + sum);
        return sum;
    }

    // к заданию 6
    public static int[] createAndFillArrayWithRandom() {
        Scanner scanner6 = new Scanner(System.in);
        Random random6 = new Random();
        System.out.println("Введите длину создаваемого массива:");
        int len = scanner6.nextInt();
        int[] array = new int[len];
        System.out.println("Ok! Был успешно создан массив длинной " + len + " элементов");
        for (int i = 0; i < array.length; i++) {
            array[i] = random6.nextInt(0, 10);
        }
        return array;
    }

    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            right[i - middle] = array[i];
        }
        mergeSort(left, middle);
        mergeSort(right, n - middle);

        merge(array, left, right, middle, n - middle);
    }

    // [10], [6] => [10,6]
    public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }



}





