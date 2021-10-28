package com.company.Lesson07_ClassWork;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

//        Person employee = new Employee();
//        employee.setName("Ivan");
//        //employee.setName("Anna");
//        Employee employee1 = new Employee();
//        Client client = new Client();
//        client.setName("Client");
//        employee1.setName("Peter");
//
//        Person[] persons = {employee, employee1, client};
//        printNames(persons);

        //диспетчиризация, полиморфная функция
        Mammal dog = new Dog();
        System.out.println(dog.sayHello());

//        Person person = new Client();
//        Client client = (Client) person;

        System.out.println();

        File img = new ImageFile("../img/111.png", 480, 640);
        img.printFileInfo();

        System.out.println();

        ArrayList<String> list = new ArrayList<>(50);
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list.size());
        for (int i = 0; i < 5; i++) {
            list.add(Integer.toString(i));
        }
        System.out.println(list.size());
        System.out.println();
        list.forEach((n)-> System.out.println(n));
        System.out.println();
        System.out.println(list.contains("abc"));
        System.out.println(list.get(0));
        System.out.println(list.indexOf("abc1"));

        list.remove(3);
        System.out.println();
        //list.forEach((n)-> System.out.println(n));
        System.out.println(list);
        System.out.println();
//        System.out.println(list.size());
//        System.out.println(list.get(3));
        
        ArrayList<Long> arrayList = new ArrayList<>();
        int count = 5;
        for (int i = 0; i < count; i++) {
            long pow = (long) Math.pow(6,i);
            arrayList.add(pow);
        }

        for (long n: arrayList
             ) {
            System.out.print(n + " ");

        }

//        Mammal mammal = new Mammal();
//        System.out.println(mammal.sayHello());
//
//        Dog dog = new Dog();
//        System.out.println(dog.sayHello());
//        @SuppressWarnings("deprecation")
//        Human human = new Human();
//        System.out.println(human.sayHello());
//        human.sayDeprecated();
//
//        SuperClass superClass = new SuperClass();
//        superClass.printValue();
//
//        SubClassA subClassA = new SubClassA();
//        subClassA.printSubValue();
//
//        SubClassB subClassB = new SubClassB();
//        subClassB.printSubValue();

    }

    public static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}

class Mammal {
    public String sayHello() {
        return "Hello hello! It's me, Mammal!";
    }
}

class Dog extends Mammal {
    @Override
    public String sayHello() {
        return "Waff";
    }
}


@Deprecated
class Human extends Mammal {
    protected int x;

    public String sayHello() {
        return "404";
    }

    public void sayDeprecated() {
        System.out.println("...");
    }
}


class SuperClass {
    protected int field;

    @SuppressWarnings({"unused", "Deprecation"})

    public int getField() {
        return field;
    }

    protected void printValue() {
        System.out.println(field);
    }
}

class SubClassA extends SuperClass {
    protected int field;

    public SubClassA() {
        this.field = 666;
        //field = 30;
        super.field = 20;
    }

    public void printSubValue() {
        super.printValue();
        System.out.println(field);
    }
}


class SubClassB extends SuperClass {
    protected int field;

    public SubClassB() {
        this.field = 999;
        //field = 30;
        super.field = 222;
    }


    public void printSubValue() {
        super.printValue();
        System.out.println(field);
    }
}


class File {
    protected String fullName;

    public File(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void printFileInfo() {
        String info = this.getFileInfo();
        System.out.println(info);
    }

    public String getFileInfo() {
        return "File " + fullName;
    }
}

class ImageFile extends File {

    protected int width;
    protected int height;
    protected byte[] content;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public ImageFile(String fullName, int i, int i1) {
        super(fullName);
        this.width = i;
        this.height = i1;
    }

    @Override
    public String getFileInfo() {
        return String.format("%s, %d, %d", fullName, width, height);
    }
}