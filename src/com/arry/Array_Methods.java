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

        int index = Arrays.binarySearch(age, 80);
        System.out.println(index);
        if(index >=0){
            System.out.println("element is present");
        }else{
            System.out.println("not found");
        }

//equals
//        int arr1[] = {1, 2, 3};
//        int arr2[] = {1,2,3};
//
//        System.out.println(Arrays.equals(arr1, arr2));

        //fill
        int num[] = new int[5];
//        num[0] = 10;
//        num[1] = 10;
//        num[2] = 10;
        Arrays.fill(num, 10);
        System.out.println(Arrays.toString(num));

//copyOf
//        int arr[] = {1,2,3,4,5};
//        int arr1[] = Arrays.copyOf(arr, 2);
//        System.out.println("old array : " + Arrays.toString(arr));
//        System.out.println("New Array : " + Arrays.toString(arr1));

        //copyOfRange
        int arr3[] = {3,4,5,6,6,8,9,10,45};
        int arr4[] = Arrays.copyOfRange(arr3, 2, 8);
        System.out.println("old Array : " + Arrays.toString(arr3));
        System.out.println("New Array : " + Arrays.toString(arr4));

        for(int i = 0; i< arr3.length; i++){
            System.out.println("The value of an array : " + arr3[i] + " the index is : " + i);
        }

      for(int j : arr3){
          System.out.println(j);
      }
      //  System.out.println(Arrays.parallelSort();)
     //  String names [] = {"Besant", "Java" , "Springboot" , "Python"};

    }
}
