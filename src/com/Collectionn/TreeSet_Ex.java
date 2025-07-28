package com.Collectionn;

import java.util.*;

public class TreeSet_Ex {

    public static void main(String[]args){
        TreeSet <String> names = new TreeSet<>();

        //names.add("Sowndharya");
        names.add("Vishnu");
        names.add("Priyanka");
        names.add("Ramana");
        names.add("Annette");
        //names.add("Sowndharya");

        System.out.println(names);

//        System.out.println(names.first());
//        System.out.println(names.last());
//        System.out.println(names.lower("Vishnu"));
//        System.out.println(names.higher("Annette"));
//        System.out.println(names.pollFirst());
//        System.out.println(names.pollLast());


        System.out.println(names.floor("Akshaya"));
        System.out.println(names.floor("Ramana"));
        System.out.println(names.ceiling("Annette"));
        System.out.println(names.floor("Priyanka"));
        System.out.println(names.ceiling("Vishnu"));
        System.out.println(names.ceiling("yamuna"));

//        System.out.println(names);


        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        NavigableSet<Integer> descending = set.descendingSet();
        System.out.println("Descending : " + descending);


        TreeSet<Integer> set1 = new TreeSet<>(Comparator.reverseOrder());
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println(set1);








    }
}

//Navigable and sorted set

//collection > set > sortedSet > NavigableSet > TreeSet
