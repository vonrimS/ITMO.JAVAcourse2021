package com.company.Lesson08_Practice_2.Task_7_2;

public class Test {
    public static void main(String[] args) {
        GeneralManager e1 = new GeneralManager("Steave Jobs", 365456454, Position.GM);
        HeadOfDepartment e2 = new HeadOfDepartment("Robert Wagner", 6545645, Position.HOD);
        Manager e3 = new Manager("John Goddow", 12345678, Position.MNGR);

        //e3.getPhoneCall();
        e3.dispatchCall();
    }
}
