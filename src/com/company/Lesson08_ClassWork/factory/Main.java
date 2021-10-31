package com.company.Lesson08_ClassWork.factory;

public class Main {
    public static void main(String[] args) {
        TableStore tableStore = new TableStore();
        Table strangeTable = tableStore.orderTable("Mysterious table");
        Table officeTable = tableStore.orderTable("office");
        Table kitchenTable = tableStore.orderTable("kitchen");

        System.out.println(strangeTable);
        System.out.println(officeTable);
        System.out.println(kitchenTable);
    }
}
