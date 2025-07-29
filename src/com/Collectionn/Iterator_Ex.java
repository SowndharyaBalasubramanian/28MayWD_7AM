package com.Collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Ex {
    public static void main(String[]args){
        List<String> names = new ArrayList<>();

        names.add("Sowndharya");
        names.add("Yuvaraj");
        names.add("Bala");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
        }
    }
}
