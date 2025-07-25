package com.Collectionn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Ex {
    public static void main(String[]args){
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("html");
        linkedHashSet.add("css");
        linkedHashSet.add("java");
        linkedHashSet.add("Springboot");
        linkedHashSet.add("java");
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }
}
