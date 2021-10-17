package com.company.Lesson04_Practice;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        1.	Написать метод для поиска самой длинной строки.

       /*
        String[] srcString1 = {"Java", "C#", "Python", "Ruby-on-Rail", "C++"};
        System.out.println(detectTheLongestString(srcString1));
        System.out.println("----------------------------");
        */

//        2.	Написать метод, который проверяет является ли слово палиндромом.
//          «Madam, I’m Adam» («Мадам, я — Адам», — представился первый человек первой женщине)
//          «Eve» («Ева», — скромно палиндромом ответила она).

        /*
        String srcString21 = "Eve"; //скромно палиндромом ответила она
        String srcString22 = "Madam, I’m Adam"; //представился первый человек первой женщине
        String srcString23 = "A man, a plan, a canal. Panama"; //классический полиндром (in Eng)
        System.out.println(checkPolindromism(srcString21));
        System.out.println(checkPolindromism(srcString22));
        System.out.println(checkPolindromism(srcString23));
        System.out.println("----------------------------");
        */


//        3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

        /*
        String srcString3 = "- Что у нас сегоня в меню?\n" +
                "- Любишь кашу с конфетами?\n" +
                "- Фуууууу! Бяка!\n" +
                "- А любишь пиццу со сгущенкой?\n" +
                "- Фуууууу! Бяка!\n" +
                "- А любишь йогурт с сосисками?\n" +
                "- Фуууууу! Бяка!\n" +
                "- А любишь творог с селёдкой?\n" +
                "- Фуууууу! Бяка!";

        System.out.println(replaceForFWord(srcString3));

         */

//
//        4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

        /*
        String srcString4 = "- Что у нас сегоня в меню?\n" +
                "- Любишь кашу с конфетами?\n" +
                "- Фуууууу! Бяка!\n" +
                "- А любишь пиццу со сгущенкой?\n" +
                "- Фуууууу! Бяка!\n" +
                "- А любишь йогурт с сосисками?\n" +
                "- Фуууууу! Бука!\n" +
                "- А любишь творог с селёдкой?\n" +
                "- Фуууууу! Бяка!";
        String targetString4 = "Фуууууу! Бяка!";
        System.out.println(countOccurrence(srcString4, targetString4));

         */



//        5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
//                Sample Output:
//                    The given string is:
//                              This is a test string
//                    The string reversed word by word is:
//                              sihT si a tset gnirts
//
//        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html
//
//        '\n' - символ новой строки;
//        '\t' - символ табуляции;
//        '\r' - символ возврата каретки;
//        '\\' - это сам символ обратной косой черты;
//        '\''- это одинарная кавычка;
//        '\"' - это двойная кавычка.
//        __________________________________________________
//
//                  %d - int, short, byte, long
//                  %c - char
//                  %f - double, float
//                  %s - String

        String src = "This is a test string";

        splitReverseConcatenate(src);


    }

    // 1
    public static String detectTheLongestString(String[] string) {
        String theLongest;
        String temp;
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i].length() < string[j].length()) {
                    temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
        }
        System.out.println("Самая длинная строка:");
        theLongest = string[0];
        return theLongest;
    }

    // 2
    public static String checkPolindromism(String srcString) {
        String polindromOK = "OK - это слово является полиндромом.";
        String polindromNOK = "NOK - это слово не является полиндромом.";

        StringBuilder modifiedSb = new StringBuilder(srcString.toUpperCase()
                .replace(",", "")
                .replace(" ", "")
                .replace("-", "")
                .replace(".", "")
                .replace("’", "")
                .trim());

        String s1 = modifiedSb.toString();
        System.out.println(s1);

        StringBuilder mirroredSb = modifiedSb.reverse();
        String s2 = mirroredSb.toString();
        System.out.println(s2);

        return s1.equals(s2) ? polindromOK : polindromNOK;
    }

    // 3
    public static String replaceForFWord(String src) {
        String modifiedString;
        String newWord = "God! Please, no!!";
        modifiedString = src.replaceAll("Бяка", newWord);
        return modifiedString;
    }

    // 4
    public static int countOccurrence(String srcString, String subString) {
        int count = 0;
        int index = 0;
        while (index != -1){
            index = srcString.indexOf(subString, index);
            if (index != -1){
                count++;
                index += subString.length();
            }

        }
        return count;
    }

    // 5
    public static void splitReverseConcatenate(String str){
        System.out.println("The given string is:\n\t\t" + str);
        String [] temp = str.split(" ");
        //System.out.println(Arrays.toString(temp));
        String output="";
        for (int i = 0; i < temp.length; i++) {
            StringBuilder sb = new StringBuilder(temp[i]);
            temp[i] = sb.reverse().toString();
            output = output.concat(temp[i]).concat(" ");
            //System.out.println(output);
        }
        output.trim();
        System.out.println("The string reversed word by word is:\n\t\t" + output);

    }

}
