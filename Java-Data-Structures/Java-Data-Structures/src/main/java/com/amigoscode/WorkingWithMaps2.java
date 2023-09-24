package com.amigoscode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps2 {

    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Alex"),new Diamond("African"));   //

        System.out.println(map.get(new Person("Alex"))); // null as we also need to override equals() and hashcode();

        System.out.println(new Person("Jamilia").hashCode()); // -163277680 | hashcodes will only be equal when we overrride the hashCode() & equals()
        System.out.println(new Person("Jamilia").hashCode()); // -163277680 | hashcodes will only be equal when we overrride the hashCode() & equals()

//      map.entrySet().forEach(x-> System.out.println(x.getKey() + " -- " + x.getValue()));
    }
    static record Diamond(String name){}

    static class Person{
        private String name;

        public Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }
/*
        @Override
        public int hashCode() {             // for given identical object it will always return same hashcode
            return Objects.hash(name);
        }
*/
    }
}




