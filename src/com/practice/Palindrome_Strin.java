package com.practice;

import java.util.Scanner;

public class Palindrome_Strin {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = s.nextLine();

        String reversed = "";
        for (int i = word.length()-1; i >=0; i-- ){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }

        s.close();
    }
}
