package com.company.Lesson08_Practice_2.Task_7_4;

import java.util.*;

public class Parking {

    private static Map<Integer, String> parkingMap = new HashMap<>();

    //кнструктор паркинга с диапазоном мест 1...30
    public Parking() {
        for (int i = 1; i < 31; i++) {
            parkingMap.put(i, "empty");
        }
    }

    //занять место в паркинге
    public void getParkingPlace(Integer place, String currentStatus) {
        if (parkingMap.get(place) == "empty") {
            parkingMap.put(place, currentStatus);
        } else if (place > 30 || place <= 0) {
            System.out.println("\u29B8 Паркинг имеет вместимость 30 машиномест. Выбранное место вне диапазона допустимых значений.");
        } else {
            System.out.println("\u29B8 Выбранное место уже занято другим автомобилем.");
        }
    }


    //получить все места в виде схемы паркинга
    public void getAllPlaces() {
        System.out.println("Карта паркинга:");
        System.out.println("--------------------------------------------------------------------------");
        for (var entry : parkingMap.entrySet()) {
            if (entry.getValue() == "empty") {
                System.out.print(entry.getKey() + "\t\t");
            } else {
                System.out.print("\u2A02" + "\t\t");
            }
            if (entry.getKey() == 10 || entry.getKey() == 20) {
                System.out.println();
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
    }




    //спросить через консоль по поводу добавления нового клиента
    public void actionQuery() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ A ] - Добавить нового клиента");
        System.out.println("[ C ] - Удалить существующего клиента");
        System.out.print("Введите значение: ");
        if (scanner.nextLine().equalsIgnoreCase("A") ) {
            addNewClient();
        } else if (scanner.nextLine().equalsIgnoreCase("C")) {
            quitParking();

        } else {
            System.out.println("NOK! Неправильный ввод.");
            actionQuery();
        }
    }

    public void quitParking(){
        System.out.println("Введите номер места, которое освобождает клиент.");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (parkingMap.get(i) != "empty"){
            parkingMap.put(i, "empty");
            getAllPlaces();
            actionQuery();
        }else{
            System.out.println("Место было свободно. Возможно произошла ошибка при вводе номера места. Проверьте.");
            getAllPlaces();
        }
    }

    public void addNewClient() {
        int i = new Random().nextInt(1, 30);
        System.out.println("Клиент запрашивает место: " + i + ". ");
        System.out.println("Проверить доступность? Y / N");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.toUpperCase(Locale.ROOT).equals("Y")) {
            getParkingPlace(i, "0 XXX 00 111");
            getAllPlaces();
            actionQuery();
        } else if (choice.toUpperCase(Locale.ROOT).equals("N")) {
            System.out.println("OK! Закрываем приложение.");
            scanner.close();
        } else {
            System.out.println("NOK! Неправильный ввод.");
            addNewClient();
        }
        }


}
