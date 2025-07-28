package com.Collectionn;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_DeQue {
    public static void main(String[]args){
        Deque <String> City = new ArrayDeque<>();
        City.addFirst("Chennai");
        City.add("Bangalore");
        City.add("Madurai");
        City.addLast("CMBT");
        System.out.println(City);

        System.out.println(City.pop());
        System.out.println(City.peek());
        System.out.println(City.peekFirst());
        System.out.println(City.peekLast());
        System.out.println(City.poll());
        System.out.println(City.pollFirst());
        System.out.println(City.pollLast());
        System.out.println(City);

    }
}

//cmbt
//cmbt
//cmbt
//cmbt
//cmbt
//null
//null


//fifo