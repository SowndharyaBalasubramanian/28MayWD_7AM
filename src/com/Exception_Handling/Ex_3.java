package com.Exception_Handling;

public class Ex_3 {
    public static void main(String[] args){
        String name = null;
        try{
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println(e);
        }finally{
            System.out.println("file is closed");
        }
    }
}
