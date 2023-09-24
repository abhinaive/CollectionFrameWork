package com.amigoscode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();  // Use TreeSet if order is important
        balls.add(new Ball("purple"));
        balls.add(new Ball("purple")); // duplicate will not be stored
        balls.add(new Ball("yellow"));
        balls.add(new Ball("green"));
        balls.remove(new Ball("green"));

        System.out.println(balls.size()); // 3
        balls.forEach(System.out::println);
        /* Order is not guaranteed
           Ball[color=green]
           Ball[color=yellow]
           Ball[color=purple]
         i.e why there is not get() method in set*/



    }
//    record Ball(String color){}

    static class Ball{
        private String color;
        public  Ball(String color){
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

}
