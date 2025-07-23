package com;

public class Wrapper_Class {
    public static void main(String [] args){
        int number = 20;
        System.out.println(number);

        Integer objInt = number;
        System.out.println(objInt);

        //primitive to object => autoboxing
        //object to primitive => unboxing

        Boolean value = true;
        System.out.println(value);

        boolean b = value;
        System.out.println(b);
    }
}

//Integer  => int
//Boolean  => boolean
//Character => char
//Long      => long
//Short     => short
//Double    => double
//Float     => float
//Byte      => byte