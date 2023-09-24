package com.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex",21));
        linkedList.add(new Person("Neymar",22));
        linkedList.add(new Person("Niman",23));

        ListIterator<Person>  personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext()){  // traverse forward
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while(personListIterator.hasPrevious()){  // traverse backword
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age){}

}
