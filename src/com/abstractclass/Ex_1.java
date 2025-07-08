package com.abstractclass;

public class Ex_1 {
    public static void main(String[] args){
        Tv t = new Tv();
        t.turnOn();
        t.display();


        Ac a = new Ac();
        a.turnOn();
        a.display();

    }
}

abstract class Electronics{

    String remote;
    static int buttons;

  abstract void turnOn();

  void display(){
      System.out.println("I am electronic device");
  }
}

class Tv extends Electronics{


    public void turnOn(){
        System.out.println("Tv is turned on");

        System.out.println(super.remote);
        System.out.println(super.buttons);
    }

    public void display(){
        System.out.println("I am TV");
    }
}

class Ac extends Electronics{
    public void turnOn(){
        System.out.println("AC is turned on");
    }
}
