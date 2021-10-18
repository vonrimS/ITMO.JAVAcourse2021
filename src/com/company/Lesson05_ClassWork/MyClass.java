package com.company.Lesson05_ClassWork;

public class MyClass {
    int field;
    public void print(){
        //System.out.println("instance method");
        System.out.println(this.field);
    }

    public static void printStaticMethod(){
        System.out.println("static method");
    }
}


class MyClassStatic{
    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.field = 10;
//        obj.print();

        //сразу по имени класса можем обращаться к статическому методу
        MyClass.printStaticMethod();

    }
}