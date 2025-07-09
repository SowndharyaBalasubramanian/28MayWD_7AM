package com.Strng;

import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class Conversion_Ex {
    public static void main(String[] args){

        //string => string builder and string buffer

        String text = "Hello";
        System.out.println("String : " + text);
        StringBuilder sb = new StringBuilder(text);
        System.out.println("StringBuilder : " + sb);

        StringBuffer sbf = new StringBuffer(text);
        System.out.println("StringBuffer : " + sbf);

        //Stringbuilder, stringbuffer => string
        StringBuffer sbf1 = new StringBuffer("Good morning");
        System.out.println(sbf1);
        String greeting = sbf1.toString();
        System.out.println("STring : " + greeting);

        StringBuilder sb1 = new StringBuilder("learning java");
        System.out.println("StringBuilder : " + sb1);
        String course = sb1.toString();
        System.out.println("STring : " + course);


        //string builder => string buffer

        StringBuilder name = new StringBuilder("Sowndharya");
        System.out.println("string builder : " + name);
        String nam = name.toString();
        System.out.println("String : " + nam);
        StringBuffer content = new StringBuffer(nam);
        System.out.println("String buffer : " + content);
        //string buffer => string builder
    }
}
