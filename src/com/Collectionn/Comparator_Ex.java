package com.Collectionn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Ex {
    public static void main(String[]args){
        List<Employe> list = new ArrayList<>();
        list.add(new Employe(2,"Sathish", 45000d));
        list.add(new Employe(3,"Moni", 55000d));
        list.add(new Employe(1,"Mohan", 50000d));

        Collections.sort(list,new NameComparator());

        for(Employe e : list){
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }

    }
}

class Employe {
    int id;
    String name;
    double salary;

    Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

}

class NameComparator implements Comparator<Employe>{

    public int compare(Employe e1, Employe e2){
        return e1.name.compareTo(e2.name);
    }
}


class IdComparator implements Comparator<Employe>{

    public int compare(Employe e1, Employe e2){
        return e1.id - e2.id;
    }
}