package com.multithreadingg;

public class Wait_Method {
    public static void main(String[]args) throws InterruptedException{
        ChildClass tA = new ChildClass();
        tA.start();

        Thread.sleep(1000);

        synchronized (tA){
            System.out.println("main thread notify the child");
            tA.notify();
        }
    }
}

class ChildClass extends Thread{
    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("child thread is waiting");
                wait();
            } catch (InterruptedException e){
                System.out.println(e);
        }

            for (int i = 1 ; i<6 ; i++){
                System.out.println("number : " + i);
            }
        }
    }
}
