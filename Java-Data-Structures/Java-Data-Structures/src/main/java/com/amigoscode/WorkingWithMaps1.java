package com.amigoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps1 {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person("Alex"));   // 1st entry
        map.put(1,new Person("Alex"));   // Duplicates not allowed
        map.put(1,new Person("Mariam")); // Overrides the 1st entry

        System.out.println(map);  // {1=Person[name=Mariam]}

        System.out.println(map.size());  // 1
        System.out.println(map.get(1));  // Person[name=Mariam]
        System.out.println(map.containsKey(4));  // false

        map.put(2,new Person("Jerry"));
        map.put(3,new Person("Coco"));

        System.out.println(map.entrySet()); // [1=Person[name=Mariam], 2=Person[name=Jerry], 3=Person[name=Coco]]
        System.out.println(map.keySet());   // [1, 2, 3]

        map.entrySet().forEach(System.out::println);
        /* 1=Person[name=Mariam]
           2=Person[name=Jerry]
           3=Person[name=Coco] */

        map.entrySet().forEach(x-> System.out.println(x.getKey() + " > " + x.getValue()));
        /* 1 > Person[name=Mariam]
           2 > Person[name=Jerry]
           3 > Person[name=Coco]   */

        System.out.println();

        map.forEach((key, person)->{
            System.out.println(key + "-" + person);
        });
        /* 1-Person[name=Mariam]
           2-Person[name=Jerry]
           3-Person[name=Coco] */

        System.out.println(map.remove(3));  // return value Person[name=Coco]
        System.out.println(map);

        System.out.println(map.get(3)); // null
        System.out.println(map.getOrDefault(3,new Person("default"))); //if key is not present return custom val -Person[name=default]

        System.out.println(map.values()); // [Person[name=Mariam], Person[name=Jerry]]
    }
    static record Person(String name){}
}




