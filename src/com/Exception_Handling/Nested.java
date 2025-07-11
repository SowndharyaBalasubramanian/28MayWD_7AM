package com.Exception_Handling;

public class Nested {
    public static void main(String[] args){
        int [] arr = new int[3];
        int a = 4, b= 0;

//        try{
//            System.out.println(arr[5]);
//
//            int c = a/b;
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex);
//        }finally{
//            System.out.println("clean the resources");
//        }
//
//        System.out.println("program ended...");


        //nested try-catch block

        try{
            System.out.println("I am from outer try block");

            try{
                System.out.println(arr[6]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }


            try{
                int c = a/b;
                System.out.println(c);
            }catch(NullPointerException ex){
                System.out.println(ex);
            }

        }catch (Exception e){

            System.out.println(e);
            System.out.println("outer catch block");
        }
    }
}
