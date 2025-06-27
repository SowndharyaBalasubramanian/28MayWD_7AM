package com.polymorphism;

public class Method_Overriding {
    public static void main(String[] args){
//        Parent p = new Parent();
//        p.education();

//        Child c = new Child();
//        c.show();
//        c.education();

        Parent parent = new Child();
        parent.education();

    }
}

class Parent{

    public void education(){
        System.out.println("to become Doctor");
    }
}

class Child extends Parent{
    @Override

    public void education() {
        System.out.println("to become trainer");
    }

    public void show(){
        System.out.println("I am from child");
    }
}
