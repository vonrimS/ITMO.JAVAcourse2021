package com.company.Lesson08_Practice_2.Task_7_2;


import java.util.Random;


abstract class Employee {
    private String  Name;
    private int phoneNum;
    private Position employeePosition;
    private boolean isAvailable;

    public Employee(String name, int phoneNum, Position employeePosition) {
        Name = name;
        this.phoneNum = phoneNum;
        this.employeePosition = employeePosition;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Position getEmployeePosition() {
        return employeePosition;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
//
//    // попытка дозвониться до работника
//    public void getPhoneCall(){
//
//    }
//
     //переадресация звонка на руководителя
    public void dispatchCall(){

    }
}
