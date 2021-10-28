package com.company.Lesson07_ClassWork;

import java.util.Date;

public class Programmer extends Employee{
    protected String[] progLang;

//    public Programmer(String name, int year, String address, Date start, Long salary) {
//        super(name, year, address, start, salary);
//    }

    public String[] getProgLang() {
        return progLang;
    }

    public void setProgLang(String[] progLang) {
        this.progLang = progLang;
    }
}
