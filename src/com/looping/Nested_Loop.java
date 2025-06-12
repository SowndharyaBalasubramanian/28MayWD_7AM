package com.looping;

public class Nested_Loop {
    public static void main(String[] args){
        for(int rows = 1 ; rows<3 ; rows++){
            for (int col = 3;  col<3 ; col++){
                System.out.print("Column " + col + " ");
            }
            System.out.println("Rows " + rows);
        }
    }
}


//*
//* *
//* * *
//* * * *
//* * * * *

//* * * * * *
//  * * * * *
//    * * * *
//      * * *
//        * *
//          *

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