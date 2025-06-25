package com.operators;

public class Bitwise {
    public static void main(String[] args){

        int a = 18;
        int b = 25;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println( a ^ b);
        System.out.println(-a);
        System.out.println(-b);

        int c = 3;
        System.out.println(c >> 1);

        int d = 25;
        System.out.println( d >> 1);
        System.out.println( d >> 2);

        int e = -3;
        System.out.println( e >> 2);

        int f = -12;
        System.out.println(f >> 2);

    }
}
