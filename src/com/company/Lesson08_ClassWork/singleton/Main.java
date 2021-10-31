package com.company.Lesson08_ClassWork.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}

class Singleton {
    private static Singleton instance;
    //private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("was made an instance");
        System.out.println(this.hashCode());
    }

//    public static Singleton getInstance() {
//        return instance;
//    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();

            System.out.println();
        }
        return instance;
    }
}
