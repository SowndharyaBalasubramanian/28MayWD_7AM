package com.multithreadingg;

public class Synchronised_Ex {
    public static void main(String[] args){

        Object lock = new Object();
        Print t1 = new Print(lock, "Thread 1");
        Print t2 = new Print(lock, "Thread 2");


        t2.start();
        t1.start();
    }
}

//class PrintNumbers extends Thread{
//    @Override
//    public void run() {
//        Print();
//    }
//    public synchronized void Print(){
//        for (int i = 1; i <5 ; i++){
//            System.out.println("number : " + i + " " + getName());
//            try{
//                Thread.sleep(1000);
//
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}

class Print extends Thread{
    public Object lock;
    public String threadName;

    public Print(Object lock, String threadName){
        this.lock = lock;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized (lock){
            for (int i = 1; i <4 ; i++){

                try{
                    System.out.println(i + " name : " + threadName);

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
