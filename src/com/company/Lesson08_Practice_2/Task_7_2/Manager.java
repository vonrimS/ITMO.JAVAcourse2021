package com.company.Lesson08_Practice_2.Task_7_2;

import java.util.Random;

public class Manager extends HeadOfDepartment{
    public Manager(String name, int phoneNum, Position employeePosition) {
        super(name, phoneNum, employeePosition);
    }

    @Override
    public void dispatchCall() {
        int i = new Random().nextInt(2);
        //int i = 0;
        if (i == 0){
            setAvailable(false);
            //System.out.print(i);
            System.out.print("...вызываемый Вами абонент (Менеджер) занят. Если звонок действительно важен для Вас - дождитесь переадресации ");
            System.out.println("[идет переадресация на Руководителя департамента]");
            super.dispatchCall();
        } else{
            setAvailable(true);
            System.out.println("Добрый день! У телефона Менеджер. Чем я могу Вам помочь?");
        }
    }
}
