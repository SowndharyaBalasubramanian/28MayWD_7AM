package com.inheritance;

public class Super_Keyword {
    public static void main(String[] args){
    Daughter d= new Daughter();
    d.display();
    }
}

class Father{
    int property = 4;

    Father(){
        System.out.println(" I am from Father class ");
    }

    public void show(){
        System.out.println("The size of the property is " + property);
    }
}

class Daughter extends Father{
        int property = 9;

        Daughter(){
            super();
            System.out.println("Hello ");

        }
    public void display(){
        System.out.println("I am daughter class");
        System.out.println(this.property);
        System.out.println(super.property);
        super.show();
    }
}
