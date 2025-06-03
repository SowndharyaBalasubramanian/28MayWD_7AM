package com.scaner;

import java.util.Scanner;

public class UserInput_Day4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//
//        String name = scan.nextLine();
//        System.out.println("name entered : " + name);
//
//
//        System.out.println("Enter your name");
//
//        String name1 = scan.next();
//        System.out.println("name entered : " + name1);


        System.out.print("Enter your age");
        byte age = scan.nextByte();

        System.out.println("age entered : " + age);

        scan.close();
    }
}
