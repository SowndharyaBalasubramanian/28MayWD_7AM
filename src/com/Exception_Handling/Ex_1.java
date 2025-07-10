package com.Exception_Handling;

public class Ex_1 {
    public static void main(String[] args) {

        int a = 4; int b = 0;
//        int result = a/b;
//        System.out.println(result);
//
//        System.out.println("Hi i am outside try block");


        try{
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Close the document");
        }

        System.out.println("I am outside try block");

    }
}
