package com.multithreadingg;

public class Thread_Class {
    public static void main(String[] args){
        MyThread t1 =new MyThread();

        t1.start();
        t1.setName("Thread 1");

        MyThread t2 =new MyThread();

        t2.start();
        t2.setName("Thread 2");
    }

}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("the thread is running" + " " + getName());
    }
}
