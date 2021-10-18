package com.company.Lesson05_ClassWork;

public class Main {
    public static void main(String[] args) {
        //Student student = new Student();
        //System.out.println(student.name);

        Student anna = new Student();
        anna.name = "Anna";
        anna.age = 21;
        System.out.println(anna.name + " " + anna.age);

        Student nobody = new Student();
        System.out.println(nobody.name);

        Student ivan = new Student();
        ivan.name = "Ivan";
        ivan.age = 22;
        System.out.println(ivan.name + " " + ivan.age);

        Student georgy = new Student("George", 31, 5, "java, kotlin");
        System.out.println(georgy.name);
        // конструкторы



    }
}

class Student {
    String name;
    int age;
    float mark;
    String subjects;

    public Student(){
        this.name = "Anonimus";
    };

    public Student(String name, int age, float mark, String subjects) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.subjects = subjects;
    }
}

class Empty {

}

class Project {

}
