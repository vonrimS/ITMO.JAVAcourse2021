package com.company.Lesson01_Practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        1. Выведите строки в следующем порядке:
//          Я
//          хорошо
//          знаю
//          Java.

        System.out.println("Я");
        System.out.println("хоршо");
        System.out.println("знаю");
        System.out.println("JAVA");

//        2. Посчитайте результат выражения
//          ( 46 + 10 ) * ( 10 / 3 )
//          ( 29 ) * ( 4 ) * (- 15 )

        System.out.println();

        int firstNum = (46 + 10) * (10 / 3);
        System.out.println("( 46 + 10 ) * ( 10 / 3 ) = " + firstNum);

        int secondNum = (29) * (4) * (-15);
        System.out.println("( 29 ) * ( 4 ) * (- 15 ) = " + secondNum);

//        3. В переменной number, лежит целое число 10500.
//        В переменной result посчитайте следующее выражение:
//          (number / 10) / 10.
//        Результат выведите на консоль.

        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println();
        System.out.println("Результат выражения \"(number / 10) / 10\" где number = 10500 равен " + result);

//        4. Даны три числа:
//          3.6,
//          4.1,
//          5.9
//        В переменной result посчитайте произведение этих чисел.

        System.out.println();
        float fNum1 = 3.6F;
        float fNum2 = 4.1F;
        float fNum3 = 5.9F;
        float fResNum = fNum1 * fNum2 * fNum3;
        System.out.println("Переменная трех чисел с плавающей точкой равана " + fResNum);


//        5. В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести.
//        Каждое целое число нужно печатать с новой строки.
//        Формат ввода:
//          42
//          100
//          125

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число:");
        int a = scanner.nextInt();
        System.out.println("Введи второе число:");
        int b1 = scanner.nextInt();
        System.out.println("Введи третье число:");
        int c = scanner.nextInt();
        System.out.println();
        System.out.println("Хоршо! Вы ввели следующие числа:");
        System.out.println(a);
        System.out.println(b1);
        System.out.println(c);


//        6. Для целого числа b выполните следующие условные действия:
//          Если b нечетное, выведите “Нечетное”
//          Если b четное, выведите “Четное”
//          Если b четное и больше 100, выведите “Выход за пределы диапазона”
//
//        ! Использовать класс Scanner: int b = scanner.nextInt

        //Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите целое число для проверки соответствия диапазону:");
        int b = scanner.nextInt();

        if( b % 2 > 0){
            System.out.println("Нечетное");
        }
        if( b % 2 == 0){
            System.out.println("Четное");
            if( b > 100){
                System.out.println("Выход за пределы диапазона");
            }
        }



    }
}
