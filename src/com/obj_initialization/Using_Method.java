package com.obj_initialization;

public class Using_Method {
    public static void main(String[] args){
        Bike b1 = new Bike();
        b1.show(70, "Hero");
    }
}

class Bike{
    int speed;
    String model;

    public void show(int speed, String model){
        System.out.println(model + " " + speed);
    }
}
