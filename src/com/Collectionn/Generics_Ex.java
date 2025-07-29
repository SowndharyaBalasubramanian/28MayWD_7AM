package com.Collectionn;

import java.util.LinkedList;

public class Generics_Ex {
    public static void main(String[]args){
//        LinkedList list = new LinkedList();
//        list.add("String");
//        list.add(45);
//        list.add('A');
//        list.add(true);
//
//        System.out.println(list);

        LinkedList<Number> list = new LinkedList<>();
//
        list.add(45);
        list.add(4523.25d);
//        list.add('A');
//        list.add(true);

        System.out.println(list);
    }
}
