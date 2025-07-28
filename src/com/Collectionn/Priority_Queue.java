package com.Collectionn;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[]args) {
        Queue<Integer> marks = new PriorityQueue<>();
        marks.add(5);
        marks.add(5);
        marks.add(45);

        System.out.println(marks.peek());
        System.out.println(marks.poll());
        System.out.println(marks.remove(5));

       //System.out.println(marks);

    }
}
