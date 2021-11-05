package com.company.Lesson11_ClassWork;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        //File file = new File( "C:\\Users\\Profile\\Downloads\\Telegram Desktop\\image_2021-07-31_20-49-46.png");

//        System.out.println("File name: " + file.getName());
//        System.out.println("File path: " + file.getPath());
//        System.out.println("Is file: " + file.isFile());
//        System.out.println("Is directory: " + file.isDirectory());
//        System.out.println("Exists: " + file.exists());
//        System.out.println("Parent path: " + file.getParent());

        String filePath = "9111.txt";
                //null;
        File file = new File(".\\1112.txt");
        File file1 = new File(filePath);
        try {
            boolean create = file.createNewFile();
            if (create){
                System.out.println("created");
            }else{
                System.out.println("already exists");
            }
        }catch (IOException e){
            System.out.println("Failed to create new file here:" + file.getPath());
        }

        boolean renamed = file.renameTo(file1);
        if(renamed){
            System.out.println("We've renamed that correctly!");
        }else{
            System.out.println("That's not good, it's failed.");
        }

//        if(file.delete()){
//            System.out.println("deleted");
//        }else{
//            System.out.println("has not been deleted");
//        }


    }
}
