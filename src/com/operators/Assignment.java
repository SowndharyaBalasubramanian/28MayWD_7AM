package com.operators;

public class Assignment {
    public static void main(String[] args){

        int age = 67;
        age +=5;
        //age = age + 5         // age = 67 + 5        //72

        age -=10;          //72 - 10 = 62
        age *= 2;          //62*2 = 124
        age/=3 ;          // 124/3 = 41
        age %= 6;         // 41 %6 = 5
        System.out.println(age);
    }
}
