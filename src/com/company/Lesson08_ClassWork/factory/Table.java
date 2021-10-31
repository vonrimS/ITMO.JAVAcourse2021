package com.company.Lesson08_ClassWork.factory;

abstract class Table {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   void attachLegs(){
       System.out.println("Attaching legs");
   }

   void attachTableTop(){
       System.out.println("Attaching tabletop");
   }

    @Override
    public String toString() {
        return "Table{"+
                "name='"+ name + '\'' + '}';
    }
}
