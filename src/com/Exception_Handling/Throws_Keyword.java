package com.Exception_Handling;

public class Throws_Keyword {
    public static void main(String[] args){
        checkEligibilty(12);
    }
    public static void checkEligibilty(int age) throws ArithmeticException{
        if(age < 18){
//            throw new ArithmeticException("you are less than 18 and not eli to vote");
            System.out.println("minor");

        }else{
            System.out.println("eli to vote");
        }
    }
}
