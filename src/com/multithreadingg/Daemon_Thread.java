package com.multithreadingg;

public class Daemon_Thread {
    public static void main(String[] args){
        DaemonThr dt = new DaemonThr();
        dt.setDaemon(true);
        dt.start();

        DaemonThr dt1 = new DaemonThr();
        dt1.setDaemon(false);
        dt1.start();

        System.out.println("Main thread is running");
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("main thread finished");

    }
}

class DaemonThr extends Thread{
    @Override
    public void run() {
        while (isDaemon() == true){
            System.out.println("Daemon thread is executing" + " " + isDaemon());
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
