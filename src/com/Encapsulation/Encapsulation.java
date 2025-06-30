package com.Encapsulation;

import javax.swing.text.BadLocationException;

public class Encapsulation {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.accNo = 9078;
      //  ba.balance = 789;

      //  ba.details();

        ba.setSomething(450.23d);
        System.out.println(ba.getSomething());

    }
}

class BankAccount{
    int accNo = 5689789;
   private double balance = 789.00d;
    String IFSC = "IOBA56790";

    public void details(){
        System.out.println("My bank details are " + accNo + " " + IFSC + " "+ balance);
    }

    public double getSomething() {
        return balance;
    }

    public void setSomething(double balance) {
        this.balance = balance;
    }
}
