package com.method;

public class Varargs_Method {
    public static void main(String[] args) {
//        int result = add(4,5);
//        int result1 = sum(4,5, 9);
        sub("Besant");
        sub("Besant", "Sowndharya");
        sub("Besant" , "Bala" , "Java");
    }

//    public static int add(int a , int b){
//        return a + b;
//    }
//
//    public static int sum(int a , int b , int c){
//        return a + b;
//    }

    public static void sub(String...n){
        for(String names : n){
            System.out.print(names + " ");
        }
        System.out.println();

       // System.out.println(n);

    }
}
