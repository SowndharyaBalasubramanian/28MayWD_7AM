package com.method;

public class Method_Returntype {

    public static void print(){
        System.out.println("printed ");

    }

    public static int add(int a , int b){

        return a+ b;
    }

   public static void main(String[] args){
       print();
       int result = add(3, 5);
       System.out.println(result);

       System.out.println(add(4,7));

     //  add(3,5);

       int d = 4;
       int f = 6;
       System.out.println(d + f);
   }

}
