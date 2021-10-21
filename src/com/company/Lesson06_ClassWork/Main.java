package com.company.Lesson06_ClassWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserStatus active = UserStatus.ACTIVE;
        System.out.println(active);
        System.out.println(active.name());
        UserStatus blocked = UserStatus.valueOf("BLOCKED");
        System.out.println(blocked);

        UserStatus[] statuses = UserStatus.values();
        System.out.println(Arrays.toString(statuses));

        System.out.println(active.ordinal());
        System.out.println(UserStatus.BLOCKED.ordinal());

        // сравнение по значению
        System.out.println(active.equals(UserStatus.ACTIVE));
        // сравнение по ссылке
        System.out.println(active == UserStatus.ACTIVE);

        switch (active){
            case ACTIVE -> System.out.println("This user is very acitve.");
            case BLOCKED -> System.out.println("This user too much acitve so now it's blocked.");
            case UNKNOWN -> System.out.println("This user is someone who nobody knows.");
            default -> System.out.println("....default....");
        }

        System.out.println();
        for(UserStatus status : UserStatus.values()){
            System.out.println(status);
        }


    }
}

enum UserStatus {
    ACTIVE, BLOCKED, UNKNOWN
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
