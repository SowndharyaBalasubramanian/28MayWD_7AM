package com.datatype;

//import com.method.Private_Method;
import com.method.Public_Method;

public class Data_Type2 {
    public static void main(String[] args){

        boolean isCompleted = false;
        System.out.println(isCompleted);

        char letter = 'B';
        System.out.println(letter);

        byte age = 56;
        System.out.println(age);

        float percentage = 78.9f;
        System.out.println(percentage);

        boolean isMajor = true;
        System.out.println(isMajor);

        Public_Method p = new Public_Method();
        p.read();

       // Private_Method.eat();

    }
}
