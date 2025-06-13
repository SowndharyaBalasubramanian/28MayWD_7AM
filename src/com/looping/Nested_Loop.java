package com.looping;

import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args){
//        for(int rows = 1 ; rows<3 ; rows++){
//            for (int col = 3;  col<3 ; col++){
//                System.out.print("Column " + col + " ");
//            }
//            System.out.println("Rows " + rows);
//        }

//        for(int rows = 1; rows <=3; rows++){
//
//            for(int col = 1; col <=rows; col++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("please enter the no. of rows");
//
//        int row = scan.nextInt();
//        for(int rows = 1; rows <=row; rows++){
//
//            for(int col = 1; col <=rows; col++){
//                System.out.print(" 1");
//            }
//            System.out.println();
//        }
//
//        scan.close();

//        int rows = 4;
//        for(int i = 1; i <=rows; i++){
//            for (int j = 1; j<=i; j++){      // 1 <=1
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= rows-i ;k++){  //4 -1; 4<=3
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        Scanner s =new Scanner(System.in);
        System.out.println("Plsease Enter the Rows");
        int rows = s.nextInt();
        for(int i=rows;i>=1;i--) {
            for (int cols = rows; cols >= 1; cols--) {
                System.out.print(" * ");
            }
            System.out.println();
            rows--;
        }

    }
}



//row 1 =>  1 col                        //*
//row 2 =>  2 col                        //* *
//row 3 =>  3 col                        //* * *
//row 4 =>  4 col                        //* * * *
//row 5 =>  5 col                        //* * * * *


//row 1 => no space, full stars(5)                            //  * * * * *
//row 2 => 1 space, 4 stars(4)                               //     * * * *
//row 3 => 2 space, 3 stars                                   //      * * *
//row 4 => 3 space, 2 stars                                   //        * *
//row 5 => 4 space, 1 stars                                   //          *
//5= 4+1  rows = space + star
//       rows -space = star

//1
//11
//111
//1111
//11111

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

// 1
// 2 3
// 4 5 6
// 7 8 9 10

//  *******
//  *
//  *
//  *******
//        *
//        *
//  *******