package com.multithreadingg;



public class Thread_Methods {
    public static void main (String[] args){
        ThreadSample t1 = new ThreadSample();
        t1.setName("Thread A");
        t1.setPriority(10);
        t1.start();

        ThreadSample t2 = new ThreadSample();
        t2.setName("Thread B");
        t2.setPriority(1);
        t2.start();

        ThreadSample t3 = new ThreadSample();
        t3.setName("Thread C");
        t3.setPriority(5);
        t3.start();

        try{
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("main thread is interrupting");
        t1.interrupt();


//        try{
//            t1.run();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }

    }
}

class ThreadSample extends Thread {
    @Override
    public void run() {
        try {
            print();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("run method");
    }
         public void print() throws InterruptedException{
            for(int i = 1; i <5; i++){
                System.out.println("Count : " + i + " priority value : " + getPriority() );
                Thread.sleep(2000);

            }

    }
}
