package com.arry;

import java.util.Arrays;

public class SIngle_Dim {
    public static void main(String[] args){
        int roll[] = {1,2,3};  //initialization is done in same line
       // int [] Roll = {4,5,6};

        System.out.println(roll);
        System.out.println(Arrays.toString(roll));
        System.out.println(roll.length);


        String names[] = new String[4];     //4 elements
        names[0] = "Besant";
        names[1] = "Sowndharya";
        names[2] = "Vignesh";
        names[3] = "Java";
      //  names[4] = "Chennai";

        System.out.println(names);
        System.out.println(Arrays.toString(names));

        names[1] = "Springboot";
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}
