package com.inheritance;

public class Single {
    public static void main(String[] args){
//        Animal a = new Animal();
//        a.sound();

        Lion l = new Lion();
        l.eat();
        l.legs = 4;
        l.sound();
    }
}

class Animal{
    int legs = 3;

    public void sound(){
        System.out.println("The animal is making sound");
        System.out.println("it has " + legs + " legs");
    }
}

class Lion extends Animal{
    String size = "large";

    public void eat(){
        System.out.println("the lion is eating meat");
        System.out.println("The size of lion is " + size);
    }
}

