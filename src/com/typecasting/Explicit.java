package com.typecasting;

public class Explicit {
    public static void main(String[] args) {
        long l =567890;
        int i = (int) l;
        System.out.println("long " + l);
        System.out.println("integer " +  i);

        int a = 568;
        byte b = (byte)a;
        System.out.println("a  : " + a );
        System.out.println("b : " + b);
    }
}

