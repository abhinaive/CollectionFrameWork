package com.amigoscode;

import java.util.Arrays;

public class WorkingWith1DArrays {

    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        // using classical for loop
        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        // enhanced for loop
        for (String color : colors ){
            System.out.println(color);
        }

        // using streams
        Arrays.stream(colors).forEach(System.out::println);


    }

}
