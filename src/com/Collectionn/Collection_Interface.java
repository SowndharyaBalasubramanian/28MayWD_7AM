package com.Collectionn;

import java.util.ArrayList;
import java.util.List;

public class Collection_Interface {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
//        type of interface <Datatype> variable name = new class <>() ;

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        numbers.remove(2);
        boolean b = numbers.isEmpty();
        System.out.println(b);

        boolean present = numbers.contains(20);
        System.out.println(present);

        System.out.println(numbers);
    }
}
