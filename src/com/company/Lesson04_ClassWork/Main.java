package com.company.Lesson04_ClassWork;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   String str = "This is \n multiple \n string";
        System.out.println(str);

        String str1 = "";
        System.out.println(str1.length());

        String str2 = " ";
        System.out.println(str2.length());

        String str3 = "ab";
        System.out.println(str3.charAt(1));

        String nullStr = null;
        String nullStr1 ="";
        boolean empty = nullStr1.isEmpty();
        System.out.println(empty);

        String text = "\tLodsalk\n\tsl dkfj";
        System.out.println(text.toUpperCase());

        System.out.println(text.startsWith("Lo1d"));

        String repl = text.replace("", " ");
        System.out.println(repl);

        String repl1 = text.trim();
        System.out.println(repl1);

        String name = "Anna", name1 ="Elisa";
        String fullName = name + " " + name1;
        //String fullName1 = name.concat()

        String srcStr = "simple text string";
        int num = 100;
        String resultStr = srcStr + num + 50;
        System.out.println(resultStr);



        String srcStr = "simple text string";

        String first = "first";
        String second = "seConD";
        String firstUC = "FIRST";
        String fourth = "4th";

        System.out.println(first.equalsIgnoreCase(firstUC));

        char [] symbols = {'A', 'B', 'C', 'D','E', 'F'};
        System.out.println(symbols);
        String strRes = String.valueOf(symbols);

        char[] charGotBack = strRes.toCharArray();
        System.out.println(charGotBack);

        String[] parts = srcStr.split(" ");
        System.out.println(Arrays.toString(parts));

        for (int i = 0; i < srcStr.length(); i++) {
            System.out.print(srcStr.charAt(i) + " ");
        }

        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();

        System.out.printf("My name is %s", myName);

        int age = 35;
        String str1 = String.format("I'm %d years old", age);
        System.out.println(str1);

        StringBuilder empty = new StringBuilder("java!");
        System.out.println(empty.length());
        System.out.println(empty.charAt(4));
        System.out.println(empty.charAt(0));
        empty.setCharAt(0, 'Z');
        System.out.println(empty);

        empty.deleteCharAt(4);
        System.out.println(empty);

        empty.append("Java");
        System.out.println(empty);
        System.out.println();
        empty
                .append("kotlin\n")
                .append("Delphi\n")
                .append("Go\n");
        System.out.println(empty);

        StringBuilder strBuilder = new StringBuilder("java!");
        strBuilder.insert(4, " programmer");
        System.out.println(strBuilder);

        strBuilder.replace(0, 4, "cSharpdklsdkjsklj");
        strBuilder.reverse();
        System.out.println(strBuilder);
        System.out.println(strBuilder.capacity());

        //compareTo

        String s = "aaa";
        String ss = "aaa";*/

        //Отсортировать массив строк через bubble sort
        String[] text = {"I", "still", "learning", "java", "language"};
        int n = text.length;
        sortString(text, n);
        System.out.println(Arrays.toString(text));

    }

    public static void sortString(String[] arr, int n) {
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

//        String[] text = { "I", "still", "learning", "java", "language" };
//
//        for (int j = 0; j < text.length; j++) {
//            for (int i = j + 1; i < text.length; i++) {
//                if (text[i].compareTo(text[j]) < 0) {
//                    String temp = text[j];
//                    text[j] = text[i];
//                    text[i] = temp;
//                }
//            }
//            System.out.println(text[j]);
//        }

//    }
}


/*
String[] text = { "I", "still", "learning", "java", "language" };

for (int j = 0; j < text.length; j++) {
    for (int i = j + 1; i < text.length; i++) {
        if (text[i].compareTo(text[j]) < 0) {
            String temp = text[j];
            text[j] = text[i];
            text[i] = temp;
        }
    }
    System.out.println(text[j]);
}
 */