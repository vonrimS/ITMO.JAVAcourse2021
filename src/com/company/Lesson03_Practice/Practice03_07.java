package com.company.Lesson03_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice03_07 {
    public static void main(String[] args) {
        //дан массив
        int[] array7 = {3, 1, 1, 2, 666, 2, 4, 4, 4, 4, 1, 2, 5, 5, 1, 3, 666, 4, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 3, 3, 5, 3};
        System.out.println("Оригинальный массив:");
        System.out.println(Arrays.toString(array7));
        int[][] numFrequency = topDscList(array7);
        System.out.println("Статистика до стортировки:");
        System.out.println(Arrays.deepToString(numFrequency));
        System.out.println("Статистика после стортировки:");
        System.out.println(Arrays.deepToString(sortArrayDsc(numFrequency)));
    }


    public static int[][] sortArrayDsc(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j][1] > array[index][1]) {
                    index = j;
                }
            }
            int[] max = array[index];
            array[index] = array[i];
            array[i] = max;
        }
        return array;
    }

    public static int[][] topDscList(int[] array) {
        // создаем массив для топ-5 элементов с вложенным массивом на 2 элемента: для индекс0 - элемент, для индекс1 - кол-во повторений
        Scanner scanner7 = new Scanner(System.in);

        int[][] topArray = new int[1][2];
        // создаем массив для получения уникальных значений и сключения дальнейших подсчетов если эти значения уже были ранее.
        int[] ignoreList = new int[0];

        for (int i = 0; i < array.length; i++) {
            // любой элемент массива как минимум встечается один раз, счетчик инициируем значением 1
            int count = 1;
            // если длина игнор листа 0, то просто добавим первым значением перовое значение оригинального массива
            if (ignoreList.length == 0) {
                ignoreList = addNewElementToArray(ignoreList, array[i]);
                //System.out.println("[+] игнор-лист пуст, добавим " + array[i] + " как первое значение.");
                for (int k = i + 1; k < array.length; k++) {
                    if (array[i] == array[k]) {
                        count++;
                    }
                }
                //System.out.println("=> элемент " + array[i] + " оригинален и упомянут в массиве " + count + " раз.");
                //записываем первое уникально значение и кол-во цитирований как первый элемент 2х мерного массива
                topArray[0] = populateArrayWithData(array[i], count);
                //arrayPlusOne(topArray, populateArrayWithData(array[i],count));

//                System.out.println(Arrays.deepToString(topArray));
//                System.out.println(Arrays.toString(ignoreList));
//                System.out.println();
            } else {
                for (int j = 0; j < ignoreList.length; j++) {
                    if (array[i] == ignoreList[j]) {
//                        System.out.println("[-] к сожалению элемент " + array[i] + " уже есть.");
//                        System.out.println();
                        break;
                    } else if (array[i] != ignoreList[j] && j == ignoreList.length - 1) {
                        ignoreList = addNewElementToArray(ignoreList, array[i]);
//                        System.out.println("[+] элемент " + array[i] + " был добавлен в игнор-лист и более не будет учитываться.");

                        for (int k = i + 1; k < array.length; k++) {
                            if (array[i] == array[k]) {
                                count++;
                            }
                        }
//                        System.out.println("=> элемент " + array[i] + " оригинален и упомянут в массиве " + count + " раз.");
                        topArray = arrayPlusOne(topArray, populateArrayWithData(array[i], count));
//                        System.out.println(Arrays.deepToString(topArray));
//                        System.out.println(Arrays.toString(ignoreList));
//                        System.out.println();
                        break;
                    }
                }
            }
        }
        //System.out.println("--------------------");
        return topArray;
    }

    public static int[] addNewElementToArray(int[] array, int newElement) {
        int[] enlargedArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            enlargedArray[i] = array[i];
        }
        enlargedArray[array.length] = newElement;
        array = enlargedArray;
        return array;
    }

    //заполним внутренний массив в формате [элемент, частота цитирования]
    public static int[] populateArrayWithData(int value, int freq) {
        int[] array = new int[2];
        array[0] = value;
        array[1] = freq;
        return array;
    }

    // заполним внешний массив
    public static int[][] arrayPlusOne(int[][] oldArray, int[] array) {
        int[][] newArray = new int[oldArray.length + 1][2];
        for (int i = 0; i < oldArray.length; i++) {
            for (int j = 0; j < oldArray[i].length; j++) {
                newArray[i][j] = oldArray[i][j];
            }
        }
        newArray[oldArray.length] = array;
        oldArray = newArray;
        return oldArray;
    }
}
