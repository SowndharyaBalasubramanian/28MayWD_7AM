package com.method;

public class Protected {
    public static void main(String[] args){
        Protected_SubClass s = new Protected_SubClass();
        s.subClass();
    }
}

class ParentClass{
    protected void display(){
        System.out.println("I am from parent class");
    }
}
