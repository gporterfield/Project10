package com.company.Porterfield;

import java.util.*;


interface Collection {
    void list();
}

class Contacts implements Collection {
    private ArrayList<Person> contList;

    public Contacts() {
        contList = new ArrayList<>();
    }

    public void add(Person person) {
        contList.add(person);
    }

    @Override
    public void list() {
        for (int i = 0; i < contList.size(); i++) {
            System.out.println(contList.get(i));
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Contacts book = new Contacts();

        Person person1 = new Person("Bob", "thing1@gmail.com");
        Person person2 = new Person("Jon", "thing2@gmail.com");
        Person person3 = new Person("Jimmy", "thing3@gmail.com");


        try {

            book.add(person1);
            book.add(person2);
            book.add(person3);

            book.list();

        } catch (NullPointerException e) {
            System.out.println("Uh Oh");
        } catch (Exception e) {
            System.out.println("Oh No");
        }

    }
}
