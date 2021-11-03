package com.company.Lesson10_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //1
        List<Object> numList = new ArrayList<>();
        numList.add(1);
        numList.add(1);
        numList.add(2);
        numList.add(3);
        System.out.println("Оригинальная коллекция: " + numList);
        System.out.println("Коллекция без дубликатов: " + removeDuplicates(numList));
        System.out.println();
        List<Object> abcList = new ArrayList<>();
        abcList.add("a");
        abcList.add("b");
        abcList.add("c");
        abcList.add("a");
        System.out.println("Оригинальная коллекция: " + abcList);
        System.out.println("Коллекция без дубликатов: " + removeDuplicates(abcList));
        System.out.println();

        //2
        List<Object> listA = new ArrayList<>();
        populateWithMillion(listA, 111);

        List<Object> listL = new LinkedList<>();
        populateWithMillion(listL, "abc");
        System.out.println();
        randomPicker(listA);
        randomPicker(listL);
        System.out.println();


        //3
        List<String> nameList = Arrays.asList("Robert", "John", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Jeffrey", "Gary", "Eric");
        Map<User, Integer> userMap = getResultMap(nameList);
        //посмотреть список игроков и кол-во очков
//        for (Map.Entry<User, Integer> userList : userMap.entrySet()){
//            System.out.println("Username: \"" + userList.getKey() + "\" Score: " + userList.getValue());
//        }
        findResultForUser(userMap);





        //4
        Integer[] array = new Integer[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = 111;
        }
        System.out.println(Arrays.toString(array));

        for (var element : arrayToMap(array).entrySet()){
            System.out.println(element.getKey() + " ==> " + element.getValue());
        }


    }

    //1
    public static Set<Object> removeDuplicates(List<Object> someList) {
        Set<Object> set = new HashSet<>(someList);
        //Set target = Set.copyOf(list);
        return set;
    }

    //2
    public static void populateWithMillion(List<Object> list, Object o) {
        long start = System.nanoTime();
        //добавляем объект х 1000.000 раз
        for (int i = 0; i < 1000001; i++) {
            list.add(o);
        }
        long stop = System.nanoTime();
        System.out.println("Время заполнения коллекции 1млн элементов стосавляет " + (stop - start) + " наносекунд.");
    }

    public static void randomPicker(List<Object> list) {
        long start = System.nanoTime();
        //рандомно выбираем элемент из списка х 100.000 раз
        for (int i = 0; i < 100001; i++) {
            int index = new Random().nextInt(1000000);
            Object o = list.get(index);
        }
        long stop = System.nanoTime();
        System.out.println("Время выбора рандомного элемента 100.000 раз составляет  " + (stop - start) + " наносекунд.");
    }

    //3
    public static Map<User, Integer> getResultMap(List<String> list) {
        Map<User, Integer> map = new HashMap<>();
        for (String s : list) {
            //System.out.println(s);
            map.put(new User(s), new Random().nextInt(100));
        }
        return map;
    }

    //3
    public static void findResultForUser(Map<User, Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя игрока для поиска его результатов: ");
        String userName = sc.nextLine(); //Michael


        for (var entry : list.entrySet()) {
            if (entry.getKey().getName().equals(userName)) {
                System.out.println("Результат данного пользователя: " + entry.getValue());
                return;
            }
        }
        System.out.println("Пользователь с таким \"Username\" не найден.");
    }



    //4
    public static <K> Map<K, Integer> arrayToMap(K[] list) {
        Map<K, Integer> map = new HashMap<K, Integer>();
        map.put((K) Arrays.stream(list).findFirst(), (Integer) list.length);
        return map;
    }
}

//3
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
