package com.decisionmaking;

public class Nested_If {
    public static void main(String[] args){

        int marks = 40;
        if(marks > 35){
            System.out.println("pass mark");

            if(marks >=90)
                System.out.println("Grade A");
            else if (marks >=70 && marks <90) {
                System.out.println("grade B");
            } else if (marks >=50 && marks<70) {
                System.out.println("Grade c");
            } else if (marks <50) {
                System.out.println("Grade D");
            } else{
                System.out.println("not a grade A");
            }
        }else {
            System.out.println("fail mark");
        }
    }
}
