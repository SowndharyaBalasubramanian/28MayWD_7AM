package com.interface_practice;

public class Ex {
    public static void main(String[] args){
        Car c = new Car();
        c.start();
        c.stop();


        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.stop();
        ec.charge();
    }
}

interface Vehicle{
    void start();
    void stop();
}

interface Electric extends Vehicle{
    void charge();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car iss starting");
    }

    public void stop(){
        System.out.println("Car is stopping");
    }
}

class ElectricCar implements Vehicle, Electric{

    @Override
    public void start() {
        System.out.println("starting");
    }
    public void charge() {
        System.out.println("charging");
    }

    @Override
    public void stop() {
        System.out.println("stopping");
    }
}
