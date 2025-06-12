package com.obj_initialization;

public class Ref_Variable {
    public static void main(String[] args){
        Phone p1= new Phone();
        p1.camera = 250;
        p1.pName = "Samsung";

        p1.sms();

        Phone p2= new Phone();
        p2.camera = 200;
        p2.pName = "Redmi";

        p2.sms();
    }
}

class Phone{
    String pName;
    int camera;

    public void sms(){
        System.out.println("Sms have been saved in " + pName + " the camera is " + camera + " pixel");
    }
}
