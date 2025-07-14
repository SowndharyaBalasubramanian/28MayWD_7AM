package com.Exception_Handling;

public class Throw_Keyword {
    public static void main(String[] args){

        try{
            checkMarks(15);
        }catch(Exception e){
            System.out.println(e);
        }


    }

    public static void checkMarks(int marks){
        if(marks < 35){
            throw new ArithmeticException("Your mark is less than 35, u got fail rank");
        }else{
            System.out.println("pass mark");
        }
    }
}
