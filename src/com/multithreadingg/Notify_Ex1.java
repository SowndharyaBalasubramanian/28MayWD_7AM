package com.multithreadingg;

public class Notify_Ex1 {

    public static void main(String[]args) throws InterruptedException{
        Object lock = new Object();

        Worker t1 = new Worker(lock);
        Worker t2 = new Worker(lock);
        Worker t3 = new Worker(lock);

        t1.start();
        t2.start();
        t3.start();


        Thread.sleep(2000);
        for(int i = 1; i <4; i++){
            synchronized (lock){
                System.out.println("main thread notifies");
                lock.notify();
            }
            Thread.sleep(1000);

        }
    }
}

class Worker extends Thread{
    public final Object lock;

    public Worker(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println(getName() + " is waiting");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(getName() + " is notified and running");
        }
    }
}
