package com.clas;

public class Class_Ex {
        public static void main(String[] args){
        Car BMW = new Car();
        BMW.colour = "White";
        BMW.brand = "BMW";
        BMW.year = 2020;
        BMW.print();

        Car Tata = new Car();
        Tata.brand = "Tata";
        Tata.colour = "red";
        Tata.year = 2021;
        Tata.print();

    }
}

class Car{
    int year;
    String brand, colour;
    static int tyre=4;

    public void print(){
        System.out.println("The car is " + brand + " , it is " + colour + " in colour and manufactured in " + year + " no. of tyres : " + tyre);
    }
}
