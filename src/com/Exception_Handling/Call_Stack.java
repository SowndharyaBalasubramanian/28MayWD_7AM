package com.Exception_Handling;

public class Call_Stack {
    public static void main(String[] args){
        Call_Stack c = new Call_Stack();
        c.methodA();
    }

    public void methodA(){
        System.out.println("Method A");
        try{
            methodC();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public void methodB(){
        System.out.println("Method b");
        methodC();
    }

    public void methodC(){
        System.out.println("Method c");
            int c = 10/0;
            System.out.println(c);


    }
}
