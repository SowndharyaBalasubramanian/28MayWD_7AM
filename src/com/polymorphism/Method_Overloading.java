package com.polymorphism;

public class Method_Overloading {
    public static void main(String[] args){
        Sub s = new Sub();
//       int result =  s.subtraction(45,2);
//        System.out.println(result);

//        System.out.println(s.subtraction(45,2));
//        System.out.println(s.subtraction(40,5,5));
//        System.out.println(s.subtraction(45.23,40.20));

        Student stu = new Student();
        stu.print(1 , "Java");
        stu.print("Sowndharya", 25);
    }
}

class Sub{
     public int subtraction(int a , int b){
         return a -b;
     }

     public int subtraction(int a , int b, int c){
         return (a-b)-c;
     }

     public double subtraction(double a , double b){
         return  a - b;
     }
}

class Student{
    int id = 2;
    String name = "Besant";

    public void print(int id, String name){
        System.out.println(id + " " + name);
    }

    public void print(String name, int id){
        System.out.println(name + " " + id);
    }
}
