package com.company.Lesson07_ClassWork;

import java.util.Date;

public class Manager extends Employee {
    protected boolean smile;

//    public Manager(String name, int year, String address, Date start, Long salary) {
//        super(name, year, address, start, salary);
//    }


    public boolean isSmile() {
        return smile;
    }

    public void setSmile(boolean smile) {
        this.smile = smile;
    }
}
