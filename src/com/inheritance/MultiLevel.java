package com.inheritance;

public class MultiLevel {
    public static void main(String[] args){
//        Animals animals = new Animals();
//        animals.colour = "brown";
//        animals.sleep();

//        Dog d = new Dog();
//        d.sound();
//        d.sleep();

        German g = new German();
        g.eat();
        g.sound();
        g.sleep();
    }
}

class Animals{
    String colour = "Golden brown";
    public void sleep() {
        System.out.println("The animal is sleeping");
        System.out.println("the animal is " + colour + " in colour");
    }
}

class Dog extends Animals{
    int leg = 4;
    public void sound(){
        System.out.println("The dog is barking , it has " + leg + " legs" );
    }
}

class German extends Dog{

    public void eat(){
        System.out.println("The german shepherd is eating");
    }
}
