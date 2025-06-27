package com.inheritance;

public class Hierarchical {
    public static void main(String[] args){
//        Birds b = new Birds();
//        b.makeSound();

//        Peacock peacock = new Peacock();
//        peacock.colour();
//        peacock.makeSound();

        Parrot parrot = new Parrot();
        parrot.sleep();
        parrot.makeSound();
    }

}

class Birds{

    String food = "Fruits";

    public void makeSound(){
        System.out.println("The birds are eating " + food + " and making sound");
    }
}

class Peacock extends Birds{
    String colour = "Bluish green";
    public void colour(){
        System.out.println("The peacock is " + colour + " in colour");
    }
}

class Parrot extends Birds{

    public void sleep(){
        System.out.println("the parrot is sleeping");
    }
}
