package com.operators;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){

//        int a = 3;
//        int b= 6;
//        System.out.println(a + b);
//
//        int c = 6;  int d = 5;
//        int result = c + d;
//        System.out.println(result);

        Scanner s = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = s.nextInt();

        System.out.println("enter number 2");
        int num2 = s.nextInt();

//        int result1 = num1 + num2;
//        System.out.println(result1);

//        int result = num1-num2;
//        System.out.println(result);
//
//
//        int output = num1*num2;
//        System.out.println(output);
//
//        int result = num1/num2;
//        System.out.println(result);


        int output = num1%num2;
        System.out.println(output);

       // System.out.println(num1 + num2);

        s.close();

    }
}
