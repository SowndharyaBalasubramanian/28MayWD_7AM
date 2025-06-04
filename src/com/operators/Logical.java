package com.operators;

public class Logical {
    public static void main(String[] args){
        int a = 7 ; int b= 8;
//&& - operator
//        System.out.println((a < b) && (a >5));
//        System.out.println((a > b) && (a < 5));
//        System.out.println((a > b) && (a > 5));
//        System.out.println((a < b) && (a < 5));

// ||-operator
//        System.out.println((a < b) || (a >5));          //true  true   = true
//        System.out.println((a > b) || (a < 5));         //false || false = false
//        System.out.println((a > b) || (a > 5));        //false || true = true
//        System.out.println((a < b) || (a < 5));      // true || false = true
//
        //Not(! operator)


        System.out.println(!(a > b));     // false

    }
}
