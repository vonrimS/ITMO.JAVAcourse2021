package com.company.Lesson08_Practice_2.Task_7_2;


import java.util.Random;

public class GeneralManager extends Employee {

    public GeneralManager(String name, int phoneNum, Position employeePosition) {
        super(name, phoneNum, employeePosition);
    }

    @Override
    public void dispatchCall() {
        int i = new Random().nextInt(2);
        //int i = 0;
        if (i == 0) {
            setAvailable(false);
            System.out.print("...вызываемый Вами абонент (Генеральный менеджер) недоступен. После сигнала Вы можете оставить сообщение. ");
            System.out.println("БИИИИИП!.....");
        } else {
            System.out.println("Добрый день! У телефона Генеальный менеджер. Чем я могу Вам помочь?");
            setAvailable(true);
            return;
        }
    }

}
