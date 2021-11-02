package com.company.Lesson09_Practice;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int[][] arrayTest = {{1, 2, 3, 4}, {1, 2}, {1, 2, 3, 4}, {2, 0}};
        fillArray(array, 100);
        System.out.println(Arrays.deepToString(array));
        //1
        System.out.println(findMaxElement(array));
        //2
        System.out.println(isSquared(array)); //true
        System.out.println(isSquared(arrayTest)); //false
        //3
        System.out.println(Arrays.toString(maxSubArray(array)));
        //4
        System.out.println(Arrays.deepToString(fillWithChar()));
        //5
        System.out.println();
        int[] numbers = new int[10];
        fillSimpleArray(numbers, 5);
        System.out.println(Arrays.toString(numbers));
        int[] weight = new int[10];
        fillSimpleArray(weight, 5);
        System.out.println(Arrays.toString(weight));
        randomMatcher(numbers, weight);

    }

    //заполним двухмерный массив
    public static int[][] fillArray(int[][] array, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(max);
            }
        }
        return array;
    }

    public static int[] fillSimpleArray(int[] array, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(max);
        }
        return array;
    }


    //1. поиск наибольшего элемента массива
    public static int findMaxElement(int[][] array) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[index1][index2]) {
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return array[index1][index2];
    }

    //2. проверка массива является ли он квадратным
    public static boolean isSquared(int[][] array) {
        int rowCount = array.length;
        boolean isSquared = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length == rowCount) {
                    isSquared = true;
                } else {
                    isSquared = false;
                    return isSquared;
                }
            }
        }
        return isSquared;
    }

    //3. поиск строки в 2х мерной матрице с наибольшей суммой элементов этой строки
    public static int[] maxSubArray(int[][] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (IntStream.of(array[i]).sum() > IntStream.of(array[index]).sum()) {
                index = i;
            }
        }
        System.out.print("Наибольшая сумма: " + IntStream.of(array[index]).sum() + ". Подмассив: ");
        return array[index];
    }

    //4. заполняем 2х мерный массив случайными символами алфавита
    public static char[][] fillWithChar() {
        int i = new Random().nextInt(3, 8);
        int j = new Random().nextInt(3, 8);
        char[][] randomCharArray = new char[i][j];
        for (int k = 0; k < randomCharArray.length; k++) {
            for (int l = 0; l < randomCharArray[k].length; l++) {
                randomCharArray[k][l] = (char) new Random().nextInt(65, 90);
            }
        }
        return randomCharArray;
    }

    //5. выбираем случайное число из массива 1, коорое есь во втором массиве
    public static void randomMatcher(int[] array1, int[] array2) {
        int i = new Random().nextInt(0, array1.length);
        int target = array1[i];
        System.out.println("Выбранное число: " + target);
        for (int element : array2) {
            if(element == target){
                System.out.println("Элемент найден. Это элемент [" + i+"] второго массива.");
                return;
            } else{

            }
        }
        System.out.println("Совпадения не найдены...");

    }
}