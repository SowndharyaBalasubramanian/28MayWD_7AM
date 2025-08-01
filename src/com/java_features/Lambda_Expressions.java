package com.java_features;

public class Lambda_Expressions {
    public static void main(String[] args){
        Hi h = new Hi();
        h.sayHi();

        Greeting g = new Hi();
        g.sayHi();

        Greeting greet = () -> System.out.println("Hello");
        greet.sayHi();

        Add add = (a , b)-> a+b;
        System.out.println(add.sum(2,3));
    }
}

@FunctionalInterface
interface Greeting{
    void sayHi();

}

class Hi implements Greeting{
    public void sayHi(){
        System.out.println("hi");
    }
}

@FunctionalInterface
interface Add{
    int sum(int a , int b);
}
