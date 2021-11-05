package com.company.Lesson11_ClassWork;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\src\\com\\company\\Lesson11_ClassWork\\FileSrc.txt");
        //D:\CODING\JavaCourse\src\com\company\Lesson11_ClassWork
        //System.out.println(new File(".").getAbsoluteFile());
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Anna\n");
            writer.write("John\n");
            writer.write("David\n");
            writer.write("Ivan");
            writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        File file1 = new File(".\\src\\com\\company\\Lesson11_ClassWork\\FileSrc2.txt");
        try(PrintWriter printWriter = new PrintWriter(file1)){
            printWriter.println("Hello my Baby, hello my Honey");
            printWriter.println("Java");
            printWriter.printf("you have %d apples", 10);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //чтение
        System.out.println();
        try (Scanner sc = new Scanner(file1)){
            while (sc.hasNext()){
                System.out.println(sc.nextLine() + " ");
            }
        }catch (FileNotFoundException e){
            System.out.println(file1);
        }

        System.out.println();
        //System.out.println(readMe(".\\src\\com\\company\\Lesson08_Practice_2\\Task_7_2\\Test.java"));

        BufferedReader bufferedReader = null;
        try{
            File fileBR = new File(".\\src\\com\\company\\Lesson11_ClassWork\\FileBR.txt");
            if(!file.exists())
                file.createNewFile();

            PrintWriter printWriter = new PrintWriter(fileBR);
            printWriter.println("str");
            printWriter.close();
            bufferedReader = new BufferedReader(new FileReader(fileBR.getPath()));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                assert bufferedReader != null;
                bufferedReader.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    //читаем файл и выводим на консоль
    public static String readMe (String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
