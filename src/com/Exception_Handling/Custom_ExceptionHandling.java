package com.Exception_Handling;

public class Custom_ExceptionHandling {
    public static void main(String[] args){
        try{
            eligibilitycheck(12);
        } catch (CheckEligibility e) {
            System.out.println("error message : " + e.getMessage());
        }
    }

    public static void eligibilitycheck(int age) throws CheckEligibility{
        if(age < 18){
            throw new CheckEligibility("you are minor");
        }else{
            System.out.println("major");
        }
    }
}

class CheckEligibility extends RuntimeException{
   public CheckEligibility(String message){
       super(message);
   };

}
