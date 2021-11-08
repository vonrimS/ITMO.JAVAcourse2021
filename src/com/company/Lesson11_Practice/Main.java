package com.company.Lesson11_Practice;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //1
//        File file = new File(".\\src\\com\\company\\Lesson11_Practice\\src1.txt");
//        print(file);
//        List<String> list = fileToArray(file);
//        System.out.println(list);

        //2
        File file2 = new File(".\\src\\com\\company\\Lesson11_Practice\\src2.txt");
        appendToFile(file2, "Hello");
        appendToFile(file2, "Hello");


        File file3 = new File(".\\src\\com\\company\\Lesson11_Practice\\src3.txt");
        appendToFile(file2, "Hello");
        appendToFile(file2, "Hello");
        appendToFile(file3, "WTF");

        //3
      /*  File file0 = mergeFiles(file2, file3);
        print(file0);

        //4
        File fileSrc = new File(".\\src\\com\\company\\Lesson11_Practice\\srcScr.txt");
        fileSrc.createNewFile();
       // print(fileSrc);
        File fileDest = new File(".\\src\\com\\company\\Lesson11_Practice\\srcDest.txt");
        backupFile(fileSrc, fileDest);
        print(fileDest);

        //5
        File dir = new File(".\\src\\com\\company\\Lesson11_Practice");
        String name = "src0";
        String[] s = findMatch(dir, name);
        System.out.println(Arrays.toString(s));


        //6
        File dir6 = new File(".\\src\\com\\company\\Lesson11_Practice\\6");
       // ArrayList<String> list = findMatchToSubstring(dir6, "ABC");
*/

    }

    //тест-вывод текста в консоль
    public static void print(File file) {
        if (!file.exists())
            System.out.println("Файл не существуетю");
        try (Scanner sc = new Scanner(file)) {
            //System.out.println("------------test print--------------");
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
            //System.out.println("------------test print--------------");
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //      1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static List<String> fileToArray(File file) {
        if (!file.exists())
            System.out.println("Файла не существует.");
        List<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine())
                list.add(sc.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    //      2.	Написать метод, который записывает в файл строку, переданную параметром.
    public static void appendToFile(File file, String string) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(string + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        print(file);
    }

    //      3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла в один.
    public static File mergeFiles(File f1, File f2) throws IOException {
        File f0 = new File(".\\src\\com\\company\\Lesson11_Practice\\src0.txt");
        if (!f0.exists())
            f0.createNewFile();

        PrintWriter pw = new PrintWriter(f0);
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(f1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(f2));

        String line1 = bufferedReader1.readLine();
        while (line1 != null) {
            pw.println(line1);
            line1 = bufferedReader1.readLine();
        }

        String line2 = bufferedReader2.readLine();
        while (line2 != null) {
            pw.println(line2);
            line2 = bufferedReader2.readLine();
        }

        pw.flush();

        bufferedReader1.close();
        bufferedReader2.close();

        pw.close();

        return f0;
    }

    //      4.	Написать метод для копирования файла (побайтно, или массивами байт).
    public static void backupFile(File src, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    //      5.	Написать метод, который в каталоге ищет файлы, в имени которых содержится определенная строка, и который возвращает список имен таких файлов.
    public static String[] findMatch(File directory, String fileName) {
        FilenameFilter filter = (dir, name) -> name.contains(fileName);
        String[] matchedFiles = directory.list(filter);
        return matchedFiles;
    }

    //      6.	Написать метод, который в каталоге ищет текстовые файлы, в которых содержится определенная строка,
    //      и которая возвращает список имен таких файлов. (FilenameFilter)
    public static ArrayList<String> findMatchToSubstring(File directory, String substring) {
        System.out.println("Метод ищет строку: \"" + substring+ "\"" );
        File[] dirListing = directory.listFiles();
        ArrayList<String> list = new ArrayList<>();
        if (dirListing != null) {
            for (File f : dirListing) {
                try {
                    Scanner sc = new Scanner(f);
                    while (sc.hasNextLine()) {
                        if (sc.nextLine().contains(substring)) {
                            list.add(f.getName());
                        } else {
                            //System.out.println("---не содержит под-строку");
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        if(list.isEmpty()){
            System.out.println("...совпадений не найдено.");
        } else{
            System.out.print("Совпадения найдены в следующих файлах: ");
            System.out.println(list);
        }
        return list;
    }
}
