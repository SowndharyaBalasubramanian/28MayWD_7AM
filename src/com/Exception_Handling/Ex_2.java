package com.Exception_Handling;

public class Ex_2 {
    public static void main(String[] args) {
        int [] arr = new int[4];

        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("terminated....");

    }
}
