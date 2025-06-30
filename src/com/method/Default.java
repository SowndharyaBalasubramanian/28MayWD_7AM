package com.method;

public class Default {
    public static void main(String[] args){
        Default_SubClass d = new Default_SubClass();
        d.lake();
    }
}

class WaterBody{
     void water(){
        System.out.println("It is whole water body");
    }
}
