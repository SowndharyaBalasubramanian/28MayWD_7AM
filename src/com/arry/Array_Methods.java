package com.arry;

import java.util.Arrays;

public class Array_Methods {
    public static void main(String[] args){
        int age[] = {23, 78, 56, 14, 67,90,6};
        System.out.println("Length : " + age.length);

        //sort(ascending order)
//        Arrays.sort(age);
//        System.out.println(Arrays.toString(age));

//        String topic[] = {"intro" , "Datatype" , "Variable" , "Method" ,"class" , "Decision"};
//        Arrays.sort(topic);
//        System.out.println(Arrays.toString(topic));



        //Binary Search
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        int index = Arrays.binarySearch(age, 56);
        System.out.println(index);
        if(index >=0){
            System.out.println("element is present");
        }else{
            System.out.println("not found");
        }


    }
}
