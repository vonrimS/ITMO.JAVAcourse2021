package com.company.Lesson05_ClassWork;

public class SomeClass {
    public static String staticStr;
    public static int staticInt;
    public static final long SPEED_OF_LIGHT = 300_000_000;

}

class ClassStat{
    public static void main(String[] args) {
        SomeClass.staticInt = 10;
        SomeClass.staticStr = "static static";
        //SomeClass.SPEED_OF_LIGHT = 10; //работает если ПЕРЕМЕННАЯ не final
        System.out.println(SomeClass.staticInt);
        System.out.println(SomeClass.staticStr);
    }
}
