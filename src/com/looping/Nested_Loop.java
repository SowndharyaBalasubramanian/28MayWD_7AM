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
