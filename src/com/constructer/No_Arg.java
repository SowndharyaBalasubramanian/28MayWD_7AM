package com.constructer;

public class No_Arg {
    public static void main(String[] args){
        Students s1  = new Students();
//        s1.name = "Sow";
//        s1.mark = 98.75;

        s1.display();

        Students s2 = new Students();
        s2.name = "Vignesh";
        s2.mark  = 89;
        s2.display();
    }
}

class Students{
    String name;
    double mark;

    Students(){
        name = "Sowndharya";
        mark = 97;
    }

    public void display(){
        System.out.println(name + " " + mark);
    }
}
