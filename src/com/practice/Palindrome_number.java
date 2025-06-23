package com.practice;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = s.nextInt();

       int original = number;
        int reverse = 0;

        while(number!=0 ){
            int digit = number%10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }

        if(original == reverse){
            System.out.println(original + " is a palindrome");
        }else
            System.out.println(original + " not a palindrome");

        s.close();
    }
}
