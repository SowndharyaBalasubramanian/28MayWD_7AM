package com.operators;

public class Unary {
    public static void main(String[] args){

        //increment

        int num = 8;
//        System.out.println(++num); // 1+8 = 9
//        System.out.println(num++);  // 9 +1 =10 //java memory
//        System.out.println(num);   //10


//        System.out.println(num--);   //8 -1 = 7
//        System.out.println(--num);  //7 - 1 = 6

        System.out.println(num);
        System.out.println(num++);
        System.out.println(num--);
        System.out.println(--num);
        System.out.println(++num);
        System.out.println(num);
        System.out.println(num--);
        System.out.println(num);


        //8
        //8
        //9
        //7
        //8
        //8
        //8
        //7
    }
}
