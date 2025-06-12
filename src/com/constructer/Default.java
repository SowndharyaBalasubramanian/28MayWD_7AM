package com.constructer;

public class Default {
    public static void main(String[] args){
        Student s1  = new Student();
        s1.name = "Sow";
        s1.mark = 98.75;

        s1.display();
    }
}

class Student{
    String name;
    double mark;

    public void display(){
        System.out.println(name + " " + mark);
    }
}

//default
//parameterized
//no arg constructor