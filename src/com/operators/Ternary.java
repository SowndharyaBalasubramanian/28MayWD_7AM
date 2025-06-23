package com.operators;

public class Ternary {
        public static void main(String[] args) {
        int age = 7;
//        if(age >=18){
//            System.out.println("major");
//        }else {
//            System.out.println("minor");
//        }

        //condition ? true : false

        String result = (age>=18) ? "major": "minor";
        System.out.println(result);

        //even or odd
        int num= 50;
        String answer = (num%2==0) ? "Even" : "odd";
        System.out.println(answer);
    }
}

//find the greatest number using ternary operator with 2 int and 3 int