package com.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {

        List<String> colorsUnmodifiable = List.of(  // Immutable List
                "blue",
                "yellow"
        );
//        colorsUnmodifiable.add("pink");  //Error at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)

        List colors1 = new ArrayList();   // Does not make much sense
        colors1.add("blue");
        colors1.add("purple");
        colors1.add(1);
        colors1.add(4.60);
        colors1.add(new Object());
        System.out.println("Arraylist with no generics : " + colors1);
//      System.out.println();

        List <String> colors2 = new ArrayList<>();  // To restrict which type of element to store
        colors2.add("blue");
        colors2.add("purple");
        colors2.add("yellow");
        colors2.add("green");
        System.out.println("Arraylist with generics : " + colors2);
        System.out.println();

        System.out.print("Print list using classical for loop : ");
        for (int i = 0; i< colors2.size(); i++ ){
            System.out.print(colors2.get(i) + " ,");
        }
        System.out.println();

        System.out.print("Print list using Enhanced for loop : ");
        for (String color : colors2){
            System.out.print(color + " ,");
        }
        System.out.println();

        System.out.println("Print using forEach");
        colors2.forEach(System.out::println);
        System.out.println();

        System.out.println("Size of Arraylist : " + colors2.size());
        System.out.println("Does Arraylist contains yelllow ? " + colors2.contains("yellow"));  // returns T F
    }
}
