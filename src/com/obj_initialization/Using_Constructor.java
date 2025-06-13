package com.obj_initialization;

public class Using_Constructor {
    public static void main(String[] args){
        Bangle b1 = new Bangle("Gold" , 26);
        b1.display();

        Bangle b2 = new Bangle("Glass", 24);
        b2.display();
    }
}

class Bangle{
    int size;
    String type;

    Bangle (String type, int size){
        this.type = type;
        this.size = size;
    }
    public void display(){
        System.out.println("The bangle is " + type + " it is " + size);
    }
}
