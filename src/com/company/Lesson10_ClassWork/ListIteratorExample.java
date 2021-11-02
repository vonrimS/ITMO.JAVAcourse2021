package com.company.Lesson10_ClassWork;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasPrevious()) {
            int previousIndex = iterator.previousIndex();
            int element = iterator.previous();
            System.out.println(element + " on " + previousIndex);
        }
    }
}
