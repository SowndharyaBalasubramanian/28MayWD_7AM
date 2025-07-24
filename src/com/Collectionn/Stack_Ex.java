package com.Collectionn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_Ex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.push(78);
        stack.add(45);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

       // System.out.println(stack.remove(1));
    }
}

//lifo
