package com.multithreadingg;

public class Interrupted_Ex {
    public static void main(String[] args){
        InterruptThred t1 = new InterruptThred();
        t1.start();

        try{
          Thread.sleep(2000);
            System.out.println("main thread is interrupting");
        } catch (InterruptedException e) {
            System.out.println(e + " main thread interrupted user thread");
        }

        t1.interrupt();
        System.out.println("main thread sent signal to user thread");

    }
}

class InterruptThred extends Thread {
    @Override
    public void run() {
        for(int i = 1; i<4 ; i++){
            if(this.isInterrupted()){
                System.out.println("thread interrupted and stopping");
                break;
            }

            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e + "interrupted while sleeping") ;
                break;
            }

        }
        System.out.println("user thread terminated");
    }
}
