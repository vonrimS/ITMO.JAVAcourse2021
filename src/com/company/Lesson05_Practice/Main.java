package com.company.Lesson05_Practice;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // конструктор с параметрами в виде списка координат x,y,z
        System.out.println("Приведены два вектора для тестироания: ");
        Vector vectorA = new Vector(1, 2, 3);
        Vector vectorB = new Vector(2, 33, 22);
        System.out.println("Вектор А: " + vectorA.toString());
        System.out.println("Вектор B: " + vectorB.toString());
        System.out.println();


        //метод вычисляющий длину вектора
        System.out.print("Длина вектора А равна ");
        System.out.println(vectorA.vectorLength(vectorA));
        System.out.println();

        //скалярное произведедние векторов
        System.out.print("Скалярное приозведение векторов равно ");
        System.out.println(vectorA.scalarMultiply(vectorB));
        System.out.println();

        //новый вектор как векторное произведение
        System.out.print("Вектроное призведение равно ");
        System.out.println(vectorA.vectorMultiply(vectorB));
        System.out.println();

        //угол между векторами (или косинус угла)
        System.out.print("Угол между векторами равен ");
        System.out.println(vectorA.angleBetweenVectors(vectorB));
        System.out.println();

        //метод для суммы
        System.out.print("Сумма двух векторов равна вектору ");
        Vector vectorC = vectorA.sumVectors(vectorB);
        System.out.println(vectorC.toString());
        System.out.println();

        //метод для разницы
        System.out.print("Разница двух векторов равна вектору ");
        Vector vectorD = vectorA.subtractVectors(vectorB);
        System.out.println(vectorD.toString());
        System.out.println();

        //статический метод, который принимает целое число N и возвращающий массив случайных векторов размером N
        System.out.println("Массив случайных векторов перечислен ниже: ");
        vectorA.print(vectorA.randomVectors());

    }
}
