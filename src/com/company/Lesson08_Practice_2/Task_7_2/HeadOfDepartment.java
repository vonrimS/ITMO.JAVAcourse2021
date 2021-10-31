package com.company.Lesson08_Practice_2.Task_7_2;

import java.util.Random;

public class HeadOfDepartment extends GeneralManager {
    public HeadOfDepartment(String name, int phoneNum, Position employeePosition) {
        super(name, phoneNum, employeePosition);
    }

    @Override
    public void dispatchCall() {
        int i = new Random().nextInt(2);
        //int i = 0;
        if (i == 0){
            setAvailable(false);
            //System.out.print(i);
            System.out.print("...вызываемый Вами абонент (Руководитель департамента) занят. Если звонок действительно важен для Вас - дождитесь переадресации ");
            System.out.println("[идет переадресация на Генерального менеджера]");
            super.dispatchCall();
        } else{
            setAvailable(true);
            System.out.println("Добрый день! У телефона Руководитель департамента. Чем я могу Вам помочь?");
        }

    }
}
