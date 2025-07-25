package com.Collectionn;

import java.util.ArrayList;
import java.util.List;

public class Collection_Interface {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
//        type of interface <Datatype> variable name = new class <>() ;


        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        numbers.add(2,6);
        System.out.println(numbers);

        numbers.remove(2);

        System.out.println(numbers);
        boolean b = numbers.isEmpty();
        System.out.println(b);

        boolean present = numbers.contains(20);
        System.out.println(present);

        System.out.println(numbers);

        int size = numbers.size();
        System.out.println(size);

        int getIndex = numbers.get(0);
        System.out.println(getIndex);

         numbers.set(2,5);
        System.out.println(numbers);

        int indexOf = numbers.indexOf(10);
        System.out.println(indexOf);

        int lastIndexOf = numbers.lastIndexOf(10);
        System.out.println(lastIndexOf);

        for(int i = 0; i< numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}
