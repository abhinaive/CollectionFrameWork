package com.amigoscode;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String[] args) {

        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person("Alex",21)); //
        superMarket.add(new Person("Mariam",22));
    //  superMarket.add(new Person("Ali",23));
    //  superMarket.add(new Person("Alexa",24));

        System.out.println(superMarket.size());   // 4
        System.out.println(superMarket.peek());   //Person[name=Alex, age=21]
        System.out.println(superMarket.poll());   //Person[name=Alex, age=21] / null if queue is empty
        System.out.println(superMarket.size());   // 3
        System.out.println(superMarket.peek());   //Person[name=Mariam, age=22]
        System.out.println(superMarket.remove()); //Person[name=Mariam, age=22] / Exception if queue is empty
        System.out.println(superMarket.offer(new Person("Abhinav",22))); // True / Use offer when there is capacity constraint on your queue
        System.out.println(superMarket.peek());  // Person[name=Abhinav, age=22]
    }

    static record Person(String name, int age){}

}
