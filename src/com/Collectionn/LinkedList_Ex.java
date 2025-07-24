package com.Collectionn;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Ex {
    public static void main(String[]args){
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        fruits.addFirst("pomegranate");
        System.out.println(fruits);

        fruits.addLast("Mango");
        System.out.println(fruits);

        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);

        fruits.peek();
        System.out.println(fruits);

        fruits.peekFirst();
        System.out.println(fruits);
    }
}
