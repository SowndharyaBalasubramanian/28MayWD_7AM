package com.Strng;

public class String_Methods {
    public static void main(String[] args) {
        String course = " Java comes under Full Stack Course java besant java ";
        System.out.println(course.length());
        System.out.println(course.charAt(8));
        System.out.println(course.toLowerCase());
        System.out.println(course.toUpperCase());
        System.out.println(course.indexOf('a'));
        System.out.println(course.endsWith("dad"));
        System.out.println(course.endsWith("Course "));
        System.out.println(course.startsWith(" Full"));
        System.out.println(course.replace('a' , 'y'));
        System.out.println(course.isEmpty());
        System.out.println(course.lastIndexOf('a'));
        System.out.println(course.contains("start"));
        System.out.println(course.contains("Java"));
        System.out.println(course.repeat(2));
        System.out.println(course.trim());
        System.out.println(course.replaceAll("java" , "python"));
        System.out.println(course.replaceFirst("java" , "react"));

        String content = " Java comes under Full Stack Course ";
        String words = " JAva comes under Full Stack Course ";
        String obj = new String(" Java comes under Full Stack Course ");  //121
        String heaps = new String(" Java comes under Full Stack Course ");  //125
        System.out.println(content.equals(words));
        System.out.println(content.equals(obj));
        System.out.println(content.equalsIgnoreCase(words));
//        System.out.println(content == words);
//        System.out.println(content == obj);
//        System.out.println(obj == heaps);

        String name = "Apple";
        String text = "King";

        System.out.println(name.compareTo(text));

        //string 1 > string 2 => positive
        //string 1 < string 2 => negative

    }
}
