package com.company.Lesson08_ClassWork.factory;

abstract class TableFactory {
    abstract Table createTable(String type);

    Table orderTable(String type) {
        Table table = createTable(type);
        if (table == null) {
            System.out.println("Sorry, we are not able to create this kind of table\n");
            return null;
        }
        System.out.println("Making " + table.getName());
        table.attachLegs();
        table.attachTableTop();
        System.out.println("Created " + table.getName() + "\n");
        return table;
    }
}

class TableStore extends TableFactory {
    @Override
    Table createTable(String type) {
        if (type.equals("office")) {
            return new TableOffice("Office table");
        } else if (type.equals("kitchen")) {
            return new TableKitchen("Kitchen table");
        } else return null;
    }
}