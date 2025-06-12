package com.constructer;

public class Parameterised_Con {
    public static void main(String[] args){
        Employee e1= new Employee("Vignesh" , 150000.00d);
       e1.display();

        Employee e2= new Employee("Nivetha" , 50000.00d);
        e2.display();

    }

}
class Employee{
    String name;
    double salary;

    Employee(String name , double salary){
        this.salary =salary;
        this.name = name;
    }

    public void display(){
        System.out.println(name + " " + salary);
    }
}

