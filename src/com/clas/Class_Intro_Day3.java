package com.clas;


class Application{
    String studentName ;
    int mobile;

    static String collegeName ;

    public void filling(){
        System.out.println("Filling");
    }
}

public class Class_Intro_Day3 {
    public static void main(String[] args){

        Application besant = new Application();
        System.out.println(besant.mobile);
        System.out.println(besant.studentName);


        Application besant1 = new Application();
        System.out.println(besant1.mobile = 784545);
        System.out.println(besant1.studentName = "Besant1");

        System.out.println(Application.collegeName);

        besant.filling();

    }
}
