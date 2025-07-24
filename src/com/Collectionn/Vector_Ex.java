package com.Collectionn;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector_Ex {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(30);
        v.add(78);
        v.add(89);

        v.remove(1);

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
    }
}
