package com.company.Lesson07_ClassWork;

public class Person {
    protected String name;
    protected int year;
    protected String address;

//    public Person(String name, int year, String address) {
//        this.name = name;
//        this.year = year;
//        this.address = address;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
