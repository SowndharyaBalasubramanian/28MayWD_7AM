package com.java_features;

import java.util.ArrayList;
import java.util.List;

public class Method_References {
    public static void main(String[] args){
        List<String> names = List.of("Sowndharya","Bala" , "Besant" );

        names.forEach(name -> Ex.greet(name));

        names.forEach(Ex::greet);
    }
}

class Ex{
    public static void greet(String name){
        System.out.println("Hello " + name + "!");
    }
}
