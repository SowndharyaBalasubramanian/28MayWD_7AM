package com.Collectionn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Ex {
    public static void main(String[]args){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2,"Sathish", 45000d));
        list.add(new Employee(3,"Moni", 55000d));
        list.add(new Employee(1,"Mohan", 50000d));

        Collections.sort(list);

        for(Employee e : list){
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int compareTo(Employee e){
        //return this.id-e.id;
        //return Double.compare(this.salary, e.salary);
        return e.name.compareTo(this.name);
    }
}

//2 - 3 => -1   2   3
//2 - 1 => 1    1   2
//3 -1 = > 2    1   3    1 2 3