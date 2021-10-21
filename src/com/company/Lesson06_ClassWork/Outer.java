package com.company.Lesson06_ClassWork;


public class Outer {
    //приветная переменная во внешнем классе, будет доступна только из внутреннего класса
    private final  int number = 10;

    void someMethod() {
        //локальные переменные должны быть final
        final int x = 5;

        //локальный внутренний класс
        class Local {
            private void print() {
                System.out.println("local Devil num is " + Outer.this.number);
                System.out.println("x = " + x);
            }
        }
        Local localInner = new Local();
        localInner.print();
    }
}

class PrintLocal {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.someMethod();

    }
}
