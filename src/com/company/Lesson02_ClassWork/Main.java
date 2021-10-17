package com.company.Lesson02_ClassWork;

public class Main {

    public static void main(String[] args) {

//        int i = 10;
//        for (; i > 0; i--) {
//            System.out.println(i + " ");
//        }

//        for (int j = 1; j < 10; j++) {
//            for (int k = 1; k < 10; k++) {
//                System.out.print(j * k + "\t");
//            }
//            System.out.println();
//        }

//        while (true){
//            System.out.println("wow");
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        System.out.println();
//
//        char letter ='A';
//        while (letter <= 'Z'){
//            System.out.print(letter + " ");
//            letter++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int value;
//        do{
//            value = scanner.nextInt();
//            System.out.println(value);
//        }while (value != 0);

//        int i = 100;
//        while (true) {
//            if (i == 0) {
//                break;
//            }
//            i--;
//            System.out.print(i);
//        }

//        int i = 10;
//        while (true) {
//            if (i == 0) {
//                break;
//            }
//            i--;
//            System.out.print(i);
//        }

//        boolean stopPoint = false;
//        for (int j = 0; (j < 10) && !stopPoint; j++) {
//            for (int k = 0; k < 10; k++) {
//                System.out.print(j + " ");
//                if(j ==k){
//                    stopPoint = true;
//                    break;
//
//                }
//            }
//            System.out.println();
//        }

//        int n = 100;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

//        int n = 100;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }

//        switch (4){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println(666);
//        }

//        int i=5;
//
//        switch (i) {
//            case 1 -> System.out.println(1);
//            case 2-> System.out.println(2);
//            case 3 -> System.out.println(3);
//            default -> System.out.println(666);
//        }

//        System.out.println(Math.round(79.098987987));
//        System.out.println(Character.isLetter('a'));
//        System.out.println(Character.isLetter(121));
//
//        String name  = new String ("Anna");
//        name = name.toLowerCase();
//        System.out.println(name);

        //System.out.println(countFood(8, 3));

//        count (7, 10);
//        int portion = 50;
//        addFood(portion);
//        System.out.println();
//        System.out.println(portion);


//    public static int countFood(int weight, int age) {
//        return weight/2 + age;
//    }

//    public static void count (int weight, int age){
//        System.out.println("Ok, M'am! Please feed your cat with " + (weight/ 2 +age) + " g. of food everyday");
//    }

//    public static void addFood(int portion) {
//        portion += 10;
//        System.out.println("portion: " + portion);

        int a = 100;
        int b = a;

        String str1 = new String("java");
        String str2 = "java";

        String str3 = str2;

        //сраванение по ссылке
        System.out.println(str3 == str2);
        System.out.println(str1 == str2);

        //сравнение по значению
        System.out.println(str3.equals(str2));
        System.out.println(str1.equals(str2));

        //int aa = null;
        String strNull = null;
        System.out.println(strNull);
        strNull ="java";
        System.out.println(strNull);

    }

//////////////////

    public static void feedYourFCat(int portion) {
        portion += 20;
        System.out.println("Portion is as bis as... " + portion);
    }

    public static void feedYourFCat(int portion, int age) {
        portion += 20;
        System.out.println("Portion is as bis as... " + portion + " and it's OK as your cat is " + age + " YO.");

    }

    public static void feedYourFCat(int portion, int age, int timesPerDay) {
        portion += 20;
        System.out.println("Portion is as bis as... " + portion + " and it's OK as your cat is " + age + " YO. But you can feed it " + timesPerDay + " times per day.");
    }


}
