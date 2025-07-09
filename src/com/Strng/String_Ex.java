package com.Strng;

public class String_Ex {
    public static void main(String[] args){
        String text = "Good";
        System.out.println(text);// string literal in string constant pool
        text.concat("Morning");
        System.out.println(text);

//        String output;
        text = text.concat(" morning");
        System.out.println(text);

        text = text.concat(" evening");
        System.out.println(text);

    }
}
