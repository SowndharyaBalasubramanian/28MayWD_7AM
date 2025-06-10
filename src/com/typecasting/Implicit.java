package com.typecasting;

public class Implicit {
    public static void main(String[] args) {
        byte b = 65;
        int i = b;
        System.out.println("byte " + b);
        System.out.println("Integer " + i);

        char letter = 'A';
        int a = letter;
        System.out.println("letter " + letter);
        System.out.println(a);

        int o = 45000;
        double d = o;
        System.out.println(o);
        System.out.println(d);
    }
}
