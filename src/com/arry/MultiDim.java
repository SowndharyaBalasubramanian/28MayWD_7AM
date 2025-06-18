package com.arry;

import java.util.Arrays;

public class MultiDim {
    public static void main(String[] args){

//        int arr[][] = {{1,2,3},{4,5,6}};
//
//        System.out.println(Arrays.deepToString(arr));
//        System.out.println(arr[0][1]);
//        System.out.println(arr[1][2]);
//        arr[0][0] = 5;
//        System.out.println(Arrays.deepToString(arr));


//        int arr1[][] = new int[3][3];
//        arr1[0][0] = 4;
//        arr1[0][1] = 8;
//        arr1[2][0] = 20;
//        arr1[1][1] = 50;
//        System.out.println(Arrays.deepToString(arr1));
//
//        for(int i = 0 ; i< arr1.length;i++){
//            for (int j = 0; j<=i ; j++){
//                System.out.print(" The elements are : " + arr1[i][j] + " index num : " + i + " " + j);
//            }
//            System.out.println();
//        }

        int arr2 [][] = {{10,20},{30,40}};
        int arr3[][] = {{10, 20}, {30, 40}};

      //  System.out.println(Arrays.deepEquals(arr2, arr3));

        int target = 20;
        boolean found = false;  // still now elem is not found

        for(int [] row : arr2){
            for(int value : row){
                if(value == target){
                    found = true;
                    break;
                }
            }
        }

        System.out.println("found : " + found);
    }
}
