package com.multithreadingg;

public class Runnable_Interface {
    public static void main(String[] args){
        ThreadEx e1 = new ThreadEx();
        Thread t1 = new Thread(e1);
        t1.start();

        Thread t2 = new Thread(new ThreadEx());
        t2.start();
    }
}

class ThreadEx implements Runnable{
    @Override
    public void run() {
        System.out.println("The thread is created using runnable interface");
    }
}
