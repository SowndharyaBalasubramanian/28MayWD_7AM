package com.decisionmaking;

import java.util.Scanner;

public class IfElse_Ladder {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int age = scan.nextInt();

        if(age >= 0 && age <=5)
            System.out.println("baby");
         else if (age > 5 && age <13) {
            System.out.println("child");
        } else if (age >=13 && age <=19) {
            System.out.println("teenager");
        } else if (age >=20 && age <=50 ) {
            System.out.println("Adult");
        }else{
            System.out.println("Senior citizen");
        }
        scan.close();
    }
}
