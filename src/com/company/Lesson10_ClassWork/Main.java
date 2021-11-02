package com.company.Lesson10_ClassWork;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y;
        int result = mult.apply(11, 22);
        System.out.println(result);

        Function<String, Integer> function = s -> s.length();
        print(function);

        print(String::length);

        print(s -> {
            int count = 0;
            for (char c: s.toCharArray()) {
                if(Character.isDigit(c)){
                    count++;
                }
            }
            return count;
        });

        //пример захвата
        final String hello = "Hello, ";

        Function<String, String> helloPrint = lang -> hello + lang;
        System.out.println(helloPrint.apply("Ivan"));

        int constant = 50;
        Function<Integer, Integer>  num = x -> x + constant;
        System.out.println(num.apply(300));
        System.out.println(num.apply(400));
        System.out.println(num.apply(500));
        System.out.println(num.apply(600));


        BiFunction<Integer, Integer, Integer> max = Integer::max;
        System.out.println(max.apply(3000000,10000));

        Function<String, Person> personFunction = Person::new;
        Person anna = personFunction.apply("Anna");
        BiFunction<String, Integer, Person> personBiFunction1 = Person::new;
        Person anna1 = personBiFunction1.apply("Anna", 19);


    }


    private static void print(Function<String, Integer> function){
        System.out.println(function.apply("Happy New Year 2022!"));
    }
}

class Person{
    String name;
    String lastName;
    int age;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person(String s, String s1) {
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
