package com.company.Lesson06_Practice;

import com.sun.source.tree.Tree;
import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

//        1. Допишите в класс «Study» конструктор, что будет принимать
//        один параметр и будет устанавливать значение этого параметра в поле «course».
//        Создайте объект класса «Study».
//        В качестве значения для поля «course» установите текст:
//        «Изучение Java - это просто!».
//        Обратитесь к методу «printCourse» для вывода значения поля «course».


class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    //TODO//
    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}

//        2. Создайте класс Дом. Добавьте в него следующие данные:
//                ●	поля: количество этажей, год постройки, наименование;
//                ●	метод для установки всех значений;
//                ●	метод для вывода всех значений;
//                ●	метод, возвращающий количество лет с момента постройки.
//
//                На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик реализуйте через метод класса.
//
//        Выведите информацию про каждый объект.

class BuildingTest{
    public static void main(String[] args) {
        Building building1 = new Building(1933, 5, "Сталинка");
        System.out.println(building1.toString());
        System.out.println(building1.countYearsFromConstruction());
        System.out.println();

        Building building2 = new Building(1980, 5, "Хрущевка");
        System.out.println(building2.toString());
        System.out.println(building2.countYearsFromConstruction());

    }
}

class Building {
    int constructionYear;
    int storeyQnt;
    String name;

    public Building(int constructionYear, int storeyQnt, String name) {
        this.constructionYear = constructionYear;
        this.storeyQnt = storeyQnt;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Был создан объект типа \"Building\"" +
                " со следующими начальными значениями: " +
                "\nГод постройки: " + constructionYear +
                "\nКоличество этажей: " + storeyQnt +
                "\nИмя здания: " + name;
    }

    public int countYearsFromConstruction() {
        LocalDate currentYear = LocalDate.now();
        LocalDate constrYear = LocalDate.of(constructionYear, 01, 01);
        Period age = Period.between(constrYear, currentYear);
        return age.getYears();
    }
}


//        3. Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
//                ●	Конструктор, который устанавливает только возраст и название;
//                ●	Конструктор, который устанавливает все переменные в классе;
//                ●	Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
//
//        Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

class TreeTest{
    public static void main(String[] args) {

        SomeTree tree1 = new SomeTree(10, "Яблоня");
        SomeTree tree2 = new SomeTree(10, true, "Вишня");
        SomeTree tree3 = new SomeTree();
    }
}

class SomeTree{
    int age;
    boolean isAlive;
    String name;

    public SomeTree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public SomeTree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public SomeTree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}



//        4. Создайте класс Самолет. В классе создайте вложенный класс - крыло. Внутри класса Крыло, реализуйте:
//                ●	поле для хранения информации про вес крыла;
//                ●	метод, который будет показывать вес крыла.
//
//        В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла и выведите информацию на экран.
//        Создайте два объекта и добавьте разный вес

class AirplaneTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.wing1.setWeight(100);
        System.out.println(airplane.wing1.getWeight());
        System.out.println();
        airplane.wing2.setWeight(200);
        System.out.println(airplane.wing2.getWeight());
    }
}

class Airplane {
    Wing wing1 = new Wing();
    Wing wing2 = new Wing();


    //внутренний класс Крыло
    public class Wing{
        int weight;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

}

