package com.company.Lesson10_ClassWork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Anna", "Buuu", 32, "2018-03-25"));
        messages.add(new Message("Ivan", "Hi!", -6, "2019-01-05"));
        messages.add(new Message("Wnon", "Kill them all", 1, "2020-02-17"));
        messages.add(new Message("Bnon", "Kill them all", 1, "2020-02-17"));
        messages.add(new Message("Anon", "Kill them all", 1, "2020-02-17"));
        messages.add(new Message("Unknown", "<Spam>", -18, "2021-01-14"));

//        messages.add(new Message("first"));
//        messages.add(new Message("second"));
//        messages.add(new Message("five"));
//        messages.add(new Message("one"));
//        messages.add(new Message("two"));
//        messages.add(new Message("long number"));

      /*  messages.sort(new MessageContentComparator());
        messages.forEach(System.out::println);
        System.out.println();

        //сокращенная запись сортировки
        messages.sort(Comparator.comparing(Message::getCreated));
        messages.forEach(System.out::println);

//        messages.sort(new MessageDate());
//        messages.forEach(System.out::println);
        System.out.println();
        messages.sort(new MessageAuthorComparator());
        messages.forEach(System.out::println);*/

        System.out.println();
        messages.sort(Comparator.comparing(Message::getLikes).reversed().thenComparing(Message::getFrom));
        messages.forEach(System.out::println);
    }
}

class MessageDate implements Comparator<Message>{

    @Override
    public int compare(Message o1, Message o2) {
        return o1.getCreated().compareTo(o2.getCreated());
    }
}

class MessageAuthorComparator implements Comparator<Message> {

    @Override
    public int compare(Message message1, Message message2) {
        return message1.getFrom().compareTo(message2.getFrom());
    }
}

class MessageContentComparator implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
        int first = o1.getContent().length();
        int second = o2.getContent().length();
        return Integer.compare(first, second);
    }
}
//
//class Message {
//
//    private final String content;
//
//    public Message(String content) {
//        this.content = content;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    @Override
//    public String toString() {
//        return content;
//    }
//}


class Message {

    private final String from;
    private final String content;
    private final LocalDate created;
    private int likes;

    public Message(String from, String content, int likes, String created) {
        this.from = from;
        this.content = content;
        this.likes = likes;
        this.created = LocalDate.parse(created);
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return created.toString() + " " + from + " wrote: " +
                content + " (" + likes + ")";
    }
}
