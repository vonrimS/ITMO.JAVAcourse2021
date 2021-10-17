package com.company.Lesson02_Practice;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
//        1. Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с
//        новой строки.
        System.out.println("Нечетные числа от 1 до 99:");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------");

//        2. Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и
//        другое(то есть и на 3и на 5).Пример вывода:
//
//        Делится на 3: ….
//        Делится на 5: ….
//        Делится на 3 и на 5: ….


        System.out.println("Программа ниже выводит числа от 1 до 100, которые делятся на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Программа ниже выводит числа от 1 до 100, которые делятся на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Программа ниже выводит числа от 1 до 100, которые делятся на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------");
//
//        3. Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому
//        числу.Пример вывода:
//
//        Введите первое число:
//        5
//        Введите второе число:
//        10
//        Введите третье число:
//        15
//        Результат:
//        true
//

        Scanner scanner = new Scanner(System.in);
        int value1, value2, value3;

        System.out.println("Введите первое число:");
        value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        value2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        value3 = scanner.nextInt();

        System.out.println((value1 + value2) == (value3));

        System.out.println("--------------------------------------------");


//        4. Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число
//        больше первого числа, а третье число больше второго числа.Пример вывода:
//
//        Введите первое число:
//        5
//        Введите второе число:
//        10
//        Введите третье число:
//        15
//        Результат:
//        true

        int val1, val2, val3;
        boolean flag = false;
        System.out.println("Введите первое число:");
        val1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        val2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        val3 = scanner.nextInt();

        if (val2 > val1) {
            if (val3 > val2) {
                flag = true;
            }
        }
        System.out.println(flag);


        System.out.println("--------------------------------------------");


//        5. Напишите программу, чтобы проверить, является ли число 3 как первый или последний элемент массива целых чисел.
//        Длина массива должна быть больше или равна двум.Пример вывода:
//        array = 3, -3, 7, 4, 5, 4, 3
//        true

        int[] array = {3, -3, 7, 4, 5, 4, 3};
        //System.out.println(array[array.length - 1]);
        int target = 3;
        boolean flag5 = false;
        if (array[0] == target || array[array.length - 1] == target) {
            flag5 = true;
        }
        System.out.println(flag5);

        System.out.println("--------------------------------------------");
*/
//        6. Напишите программу, чтобы проверить, что массив содержит число 1 или 3.

        System.out.println("Содержит ли массив число 1 или 3?");

        int[] array6 = {1, 3, 0, 10, 11, 23};
        int target1 = 1;
        int target2 = 3;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] == target1) {
                System.out.println("Массив содержит число " + target1);
            }
        }
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] == target2) {
                System.out.println("Массив содержит число " + target2);
            }
        }
    }
}
