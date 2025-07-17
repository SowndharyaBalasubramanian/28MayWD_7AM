package com.multithreadingg;

public class Join_Method {
    public static void main(String[] args){
        ThreadA thra= new ThreadA();
        ThreadA thrb= new ThreadA();

        Thread mainTh = Thread.currentThread();
        //String name = "Besant";
        System.out.println(" main thread : " + mainTh.isAlive());

        System.out.println("main thread befre join method");
        System.out.println("Alive : " + thra.isAlive());
        thra.start();
        thrb.start();

        try {
            thra.join(1000);
            System.out.println("thread name : " + Thread.currentThread().getName() + " Alive : " + thra.isAlive());
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("main thread is resuming");
    }
}

class ThreadA extends Thread{
    @Override
    public void run() {
        System.out.println("thread A is running");
        for (int i = 1; i <4 ; i++){

            try{
                System.out.println(i + " name : " + Thread.currentThread().getName());

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("thread A finished");
    }
}
