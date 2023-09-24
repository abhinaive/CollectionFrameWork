package com.amigoscode;

import java.util.Stack;

public class WorkingWithStacks {

    public static void main(String[] args) {
     /*
        List<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
    */


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.size()); // Integer
        System.out.println(stack.pop());  // Integer
        System.out.println(stack.size()); // Integer
        System.out.println(stack.empty()); // T F

    }
}
