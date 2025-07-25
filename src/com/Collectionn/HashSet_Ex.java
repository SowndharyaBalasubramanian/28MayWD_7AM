package com.Collectionn;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Ex {
    public static void main(String[]args){
        Set<String> hashSet = new HashSet<>();

        hashSet.add("html");
        hashSet.add("css");
        hashSet.add("java");
        hashSet.add("Springboot");
        hashSet.add("java");
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);

        for(String courses : hashSet){
            System.out.println(courses);
        }

        hashSet.clear();
        System.out.println(hashSet);


    }
}
